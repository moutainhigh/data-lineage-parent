package org.isaac.hive.hook.events;

import org.isaac.hive.hook.HiveHookContext;
import org.isaac.hive.hook.entity.HiveEntity;

/**
 * <p>
 * DefaultEvent
 * </p>
 *
 * @author isaac 2020/9/7 16:55
 * @since 1.0.0
 */
public class DefaultEvent extends BaseHiveEvent {

    public DefaultEvent(HiveHookContext context) {
        super(context);
    }

    @Override
    public String getNotificationMessages() {
        HiveEntity ret = context.createHiveEntity();
        ret.setTypeName(HIVE_TYPE_DEFAULT);
        return context.toJson(ret.getResult());
    }
}
