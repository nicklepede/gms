package com.google.android.gms.location.settings;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.R;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asoh;
import defpackage.asot;
import defpackage.byln;
import defpackage.calv;
import defpackage.fprg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GlaNotificationService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        asot asotVar = calv.a;
        if (!fprg.d() || !asoh.g(this)) {
            return 0;
        }
        calv.c(new Runnable() { // from class: cals
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                int i2;
                asot asotVar2 = calv.a;
                Context context = this;
                asbo f = asbo.f(context);
                fvbo.c(f);
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationChannel notificationChannel = new NotificationChannel("location-important-updates", context.getString(R.string.gla_notification_channel_name), 4);
                    f.q(new NotificationChannelGroup("location-channel-group-id", context.getString(R.string.gla_notification_channel_group_name)));
                    notificationChannel.setGroup("location-channel-group-id");
                    f.p(notificationChannel);
                }
                int a = anxo.a(context, 2131232179);
                PendingIntent a2 = calv.a(context, "com.google.android.gms.location.settings.GLA_NOTIFICATION_SETTINGS_CLICKED");
                PendingIntent a3 = calv.a(context, "com.google.android.gms.location.settings.GLA_NOTIFICATION_LEARN_MORE_CLICKED");
                PendingIntent a4 = calv.a(context, "com.google.android.gms.location.settings.GLA_NOTIFICATION_CLEARED");
                ikd ikdVar = new ikd(context, "location-important-updates");
                ikdVar.m(context.getString(Build.VERSION.SDK_INT >= 28 ? R.string.gla_notification_title_v28 : R.string.gla_notification_title));
                ikb ikbVar = new ikb();
                boolean t = bwth.t(context, "gps");
                boolean t2 = bwth.t(context, "network");
                boolean z = t | t2;
                calv.b(t, t2, emlv.NOTIFICATION_SHOWN);
                if (!z) {
                    i = R.string.gla_notification_content_location_off;
                    i2 = R.string.gla_notification_content_location_off_v28;
                } else if (t2) {
                    i = R.string.gla_notification_content_gla_on;
                    i2 = R.string.gla_notification_content_gla_on_v28;
                } else {
                    i = R.string.gla_notification_content_gla_off;
                    i2 = R.string.gla_notification_content_gla_off_v28;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    i = i2;
                }
                ikbVar.d(context.getString(i));
                ikdVar.v(ikbVar);
                ikdVar.g(a);
                ikdVar.g = a2;
                ikdVar.o(a4);
                ikdVar.x = true;
                if (Build.VERSION.SDK_INT < 28) {
                    ikdVar.h(0, context.getString(R.string.gla_notification_button_learn_more), a3);
                }
                ikdVar.h(0, context.getString(R.string.gla_notification_button_settings), a2);
                f.u(-1302891281, dfee.LOCATION_ACCURACY_NOTICE, ikdVar.b());
            }
        });
        return 0;
    }
}
