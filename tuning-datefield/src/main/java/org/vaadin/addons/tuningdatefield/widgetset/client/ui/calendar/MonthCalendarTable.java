/*
 * Copyright (C) 2013 Frederic Dreyfus
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.vaadin.addons.tuningdatefield.widgetset.client.ui.calendar;


public class MonthCalendarTable extends AbstractCalendarTable {

    public MonthCalendarTable(TuningDateFieldCalendarWidget tuningDateFieldCalendar, String resolutionControlText, CalendarItem[] calendarItems,
            boolean controlsEnabled) {
        super(tuningDateFieldCalendar, resolutionControlText, calendarItems, controlsEnabled);
    }

    @Override
    protected int getNumberOfColumns() {
        return 4;
    }

    @Override
    protected String getCellItemPrimaryStylename() {
        return "month";
    }
    
    @Override
    protected String getRowPrimaryStylename() {
        return "months-row";
    }

}
