/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtenelClasses;

import com.alee.extended.panel.GroupPanel;
import com.alee.extended.time.ClockType;
import com.alee.extended.time.WebClock;
import com.alee.managers.notification.NotificationIcon;
import com.alee.managers.notification.NotificationManager;
import com.alee.managers.notification.WebNotification;

/**
 *
 * @author lenovopc
 */
public class NotificationInvalidNumber {
    public static void noty(){
    
         final WebNotification notificationPopup = new WebNotification ();
                notificationPopup.setIcon ( NotificationIcon.clock );
                notificationPopup.setDisplayTime ( 5000 );

                final WebClock clock = new WebClock ();
                clock.setClockType ( ClockType.timer );
                clock.setTimeLeft ( 6000 );
                clock.setTimePattern ( "'Invalid phone number'" );
                notificationPopup.setContent ( new GroupPanel ( clock ) );

                NotificationManager.showNotification ( notificationPopup );
                clock.start ();
    
    
    }
}
