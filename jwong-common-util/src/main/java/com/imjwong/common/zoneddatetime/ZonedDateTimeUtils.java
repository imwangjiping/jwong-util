package com.imjwong.common.zoneddatetime;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * ZonedDateTimeUtils class
 *
 * @author J.Wong
 * @date 2020/06/09
 */
public class ZonedDateTimeUtils {

    /**
     * 时间间隔
     *
     * @param unit           时间间隔单位 {@link java.time.temporal.ChronoUnit}
     * @param zonedDateTime1 时间
     * @param zonedDateTime2 时间
     * @return >=0
     * @apiNote 时间前后没有顺序，返回2个日期的间隔，结果 >=0
     */
    public static Long intervalZonedDateTime(ChronoUnit unit, ZonedDateTime zonedDateTime1, ZonedDateTime zonedDateTime2) {
        if (zonedDateTime1.isAfter(zonedDateTime2)) {
            return unit.between(zonedDateTime2, zonedDateTime1);
        }
        return unit.between(zonedDateTime1, zonedDateTime2);
    }

}