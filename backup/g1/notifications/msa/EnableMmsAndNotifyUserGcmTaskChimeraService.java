package com.google.android.gms.backup.g1.notifications.msa;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.backup.g1.notifications.msa.EnableMmsAndNotifyUserGcmTaskChimeraService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ajwt;
import defpackage.aldf;
import defpackage.auad;
import defpackage.aupz;
import defpackage.cauf;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class EnableMmsAndNotifyUserGcmTaskChimeraService extends GmsTaskBoundService {
    public static final auad a = new ajwt("EnableMmsAndNotifyUserGcmTaskChimeraService");
    public aldf b;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void d() {
        if (this.b == null) {
            this.b = new aldf();
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(final cauf caufVar) {
        d();
        aupz aupzVar = new aupz(Integer.MAX_VALUE, 10);
        final eqgl submit = aupzVar.submit(new Callable() { // from class: alea
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(aldg.b(new ajql(EnableMmsAndNotifyUserGcmTaskChimeraService.this)));
            }
        });
        final eqgl submit2 = aupzVar.submit(new Callable() { // from class: aleb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(aldg.c(new ajvu(EnableMmsAndNotifyUserGcmTaskChimeraService.this)));
            }
        });
        final eqgl submit3 = aupzVar.submit(new Callable() { // from class: alec
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(aldg.a(new ajvy(EnableMmsAndNotifyUserGcmTaskChimeraService.this)));
            }
        });
        final eqgl submit4 = aupzVar.submit(new Callable() { // from class: aled
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(aldg.d(new ajtu(EnableMmsAndNotifyUserGcmTaskChimeraService.this)));
            }
        });
        return eqgc.d(submit, submit2, submit4).a(new Callable() { // from class: alee
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean booleanValue = ((Boolean) submit.get()).booleanValue();
                EnableMmsAndNotifyUserGcmTaskChimeraService enableMmsAndNotifyUserGcmTaskChimeraService = EnableMmsAndNotifyUserGcmTaskChimeraService.this;
                if (!booleanValue) {
                    EnableMmsAndNotifyUserGcmTaskChimeraService.a.m("Not enabling MMS / showing notification because backup is off", new Object[0]);
                    enableMmsAndNotifyUserGcmTaskChimeraService.b.b(2);
                    return 2;
                }
                if (!((Boolean) submit2.get()).booleanValue() && fodw.a.lK().Q()) {
                    EnableMmsAndNotifyUserGcmTaskChimeraService.a.m("Not enabling MMS / showing notification because device is not ETU", new Object[0]);
                    enableMmsAndNotifyUserGcmTaskChimeraService.b.b(3);
                    return 2;
                }
                if (!((Boolean) submit3.get()).booleanValue()) {
                    EnableMmsAndNotifyUserGcmTaskChimeraService.a.m("Not enabling MMS / showing notification because MSA was not shown", new Object[0]);
                    enableMmsAndNotifyUserGcmTaskChimeraService.b.b(4);
                    return 2;
                }
                if (!((Boolean) submit4.get()).booleanValue()) {
                    EnableMmsAndNotifyUserGcmTaskChimeraService.a.m("Not showing notification because MMS backup is already enabled", new Object[0]);
                    enableMmsAndNotifyUserGcmTaskChimeraService.b.b(5);
                    return 2;
                }
                cauf caufVar2 = caufVar;
                alhn.a.a(enableMmsAndNotifyUserGcmTaskChimeraService, true);
                Bundle bundle = caufVar2.b;
                if (bundle == null) {
                    EnableMmsAndNotifyUserGcmTaskChimeraService.a.f("Not showing notification because extras bundle was null", new Object[0]);
                    enableMmsAndNotifyUserGcmTaskChimeraService.b.b(6);
                    return 2;
                }
                String string = bundle.getString("title");
                String string2 = bundle.getString("text");
                if (string == null || string2 == null) {
                    EnableMmsAndNotifyUserGcmTaskChimeraService.a.f("Not showing notification because extras title and text were null", new Object[0]);
                    enableMmsAndNotifyUserGcmTaskChimeraService.b.b(7);
                    return 2;
                }
                if (enableMmsAndNotifyUserGcmTaskChimeraService.b == null) {
                    enableMmsAndNotifyUserGcmTaskChimeraService.d();
                }
                Notification.Builder c = aker.c(enableMmsAndNotifyUserGcmTaskChimeraService, "com.google.android.gms.backup.g1.featureupdates.notification.channel.id");
                c.setContentTitle(string);
                c.setContentText(string2);
                Intent f = akfg.f();
                dymf.c(f, emwi.MMS_MSA_NOTIFICATION);
                PendingIntent a2 = dyph.a(enableMmsAndNotifyUserGcmTaskChimeraService, 0, f, 67108864);
                if (a2 == null) {
                    EnableMmsAndNotifyUserGcmTaskChimeraService.a.f("Not showing notification because pending intent could not be created", new Object[0]);
                    enableMmsAndNotifyUserGcmTaskChimeraService.b.b(8);
                    return 2;
                }
                c.setContentIntent(a2);
                c.setAutoCancel(true);
                c.setSmallIcon(apzg.a(enableMmsAndNotifyUserGcmTaskChimeraService, 2131232882));
                aued f2 = aued.f(enableMmsAndNotifyUserGcmTaskChimeraService);
                if (f2 != null) {
                    f2.w("com.google.android.backup.g1.notification.mms_enabled.tag", 4, dhpk.BACKUP_MMS_BACKUP_ENABLED, c.build());
                }
                aldf aldfVar = enableMmsAndNotifyUserGcmTaskChimeraService.b;
                fgrc v = emzw.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                emzw emzwVar = (emzw) v.b;
                emzwVar.c = 4;
                emzwVar.b |= 1;
                emzw emzwVar2 = (emzw) v.Q();
                fgrc v2 = emux.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                emux emuxVar = (emux) v2.b;
                emzwVar2.getClass();
                emuxVar.ab = emzwVar2;
                emuxVar.c |= 134217728;
                aldfVar.a((emux) v2.Q());
                return 0;
            }
        }, eqex.a);
    }
}
