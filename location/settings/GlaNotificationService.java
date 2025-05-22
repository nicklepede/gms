package com.google.android.gms.location.settings;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.R;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ausb;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.ccul;
import defpackage.fsky;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GlaNotificationService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        ausn ausnVar = ccul.a;
        if (!fsky.d() || !ausb.g(this)) {
            return 0;
        }
        ccul.c(new Runnable() { // from class: ccui
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                int i2;
                ausn ausnVar2 = ccul.a;
                Context context = this;
                aued f = aued.f(context);
                fxxm.c(f);
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationChannel notificationChannel = new NotificationChannel("location-important-updates", context.getString(R.string.gla_notification_channel_name), 4);
                    f.q(new NotificationChannelGroup("location-channel-group-id", context.getString(R.string.gla_notification_channel_group_name)));
                    notificationChannel.setGroup("location-channel-group-id");
                    f.p(notificationChannel);
                }
                int a = apzg.a(context, 2131232242);
                PendingIntent a2 = ccul.a(context, "com.google.android.gms.location.settings.GLA_NOTIFICATION_SETTINGS_CLICKED");
                PendingIntent a3 = ccul.a(context, "com.google.android.gms.location.settings.GLA_NOTIFICATION_LEARN_MORE_CLICKED");
                PendingIntent a4 = ccul.a(context, "com.google.android.gms.location.settings.GLA_NOTIFICATION_CLEARED");
                ilt iltVar = new ilt(context, "location-important-updates");
                iltVar.r(context.getString(Build.VERSION.SDK_INT >= 28 ? R.string.gla_notification_title_v28 : R.string.gla_notification_title));
                ilr ilrVar = new ilr();
                boolean u = bzbx.u(context, "gps");
                boolean u2 = bzbx.u(context, "network");
                boolean z = u | u2;
                ccul.b(u, u2, eozj.NOTIFICATION_SHOWN);
                if (!z) {
                    i = R.string.gla_notification_content_location_off;
                    i2 = R.string.gla_notification_content_location_off_v28;
                } else if (u2) {
                    i = R.string.gla_notification_content_gla_on;
                    i2 = R.string.gla_notification_content_gla_on_v28;
                } else {
                    i = R.string.gla_notification_content_gla_off;
                    i2 = R.string.gla_notification_content_gla_off_v28;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    i = i2;
                }
                ilrVar.d(context.getString(i));
                iltVar.o(ilrVar);
                iltVar.n(a);
                iltVar.g = a2;
                iltVar.k(a4);
                iltVar.x = true;
                if (Build.VERSION.SDK_INT < 28) {
                    iltVar.e(0, context.getString(R.string.gla_notification_button_learn_more), a3);
                }
                iltVar.e(0, context.getString(R.string.gla_notification_button_settings), a2);
                f.u(-1302891281, dhpk.LOCATION_ACCURACY_NOTICE, iltVar.b());
            }
        });
        return 0;
    }
}
