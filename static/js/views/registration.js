define([
    'backbone',
    'tmpl/registration'
    ],
    function(
        Backbone,
        tmpl
    )
{
    var View = Backbone.View.extend({

        template: tmpl,
        initialize: function () {
            this.render();
        },
        render: function () {
            this.$el.html(this.template);
            return this;
        },
        events: {
            "show" : "show"
        },
        show: function () {
            this.$el.css({'display':'block'});
            if (!$('#registration').html()) {
                $('#registration').html(this.$el);
            }
            this.trigger("show", this);
        },
        hide: function () {
            this.$el.css({'display':'none'})
        }

    });

    return new View();
});