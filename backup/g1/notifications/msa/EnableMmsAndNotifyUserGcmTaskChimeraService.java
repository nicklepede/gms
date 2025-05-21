package com.google.android.gms.backup.g1.notifications.msa;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.backup.g1.notifications.msa.EnableMmsAndNotifyUserGcmTaskChimeraService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ahwd;
import defpackage.ajcn;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.byln;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class EnableMmsAndNotifyUserGcmTaskChimeraService extends GmsTaskBoundService {
    public static final arxo a = new ahwd("EnableMmsAndNotifyUserGcmTaskChimeraService");
    public ajcn b;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void d() {
        if (this.b == null) {
            this.b = new ajcn();
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(final byln bylnVar) {
        d();
        asmf asmfVar = new asmf(Integer.MAX_VALUE, 10);
        final enss submit = asmfVar.submit(new Callable() { // from class: ajdi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(ajco.b(new ahpv(EnableMmsAndNotifyUserGcmTaskChimeraService.this)));
            }
        });
        final enss submit2 = asmfVar.submit(new Callable() { // from class: ajdj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(ajco.c(new ahve(EnableMmsAndNotifyUserGcmTaskChimeraService.this)));
            }
        });
        final enss submit3 = asmfVar.submit(new Callable() { // from class: ajdk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(ajco.a(new ahvi(EnableMmsAndNotifyUserGcmTaskChimeraService.this)));
            }
        });
        final enss submit4 = asmfVar.submit(new Callable() { // from class: ajdl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(ajco.d(new ahte(EnableMmsAndNotifyUserGcmTaskChimeraService.this)));
            }
        });
        return ensj.d(submit, submit2, submit4).a(new Callable() { // from class: ajdm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean booleanValue = ((Boolean) submit.get()).booleanValue();
                EnableMmsAndNotifyUserGcmTaskChimeraService enableMmsAndNotifyUserGcmTaskChimeraService = EnableMmsAndNotifyUserGcmTaskChimeraService.this;
                if (!booleanValue) {
                    EnableMmsAndNotifyUserGcmTaskChimeraService.a.m("Not enabling MMS / showing notification because backup is off", new Object[0]);
                    enableMmsAndNotifyUserGcmTaskChimeraService.b.b(2);
                    return 2;
                }
                if (!((Boolean) submit2.get()).booleanValue() && flmm.a.a().Q()) {
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
                byln bylnVar2 = bylnVar;
                ajgv.a.a(enableMmsAndNotifyUserGcmTaskChimeraService, true);
                Bundle bundle = bylnVar2.b;
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
                Notification.Builder c = aieb.c(enableMmsAndNotifyUserGcmTaskChimeraService, "com.google.android.gms.backup.g1.featureupdates.notification.channel.id");
                c.setContentTitle(string);
                c.setContentText(string2);
                Intent f = aieq.f();
                dwae.c(f, ekiw.MMS_MSA_NOTIFICATION);
                PendingIntent a2 = dwdg.a(enableMmsAndNotifyUserGcmTaskChimeraService, 0, f, 67108864);
                if (a2 == null) {
                    EnableMmsAndNotifyUserGcmTaskChimeraService.a.f("Not showing notification because pending intent could not be created", new Object[0]);
                    enableMmsAndNotifyUserGcmTaskChimeraService.b.b(8);
                    return 2;
                }
                c.setContentIntent(a2);
                c.setAutoCancel(true);
                c.setSmallIcon(anxo.a(enableMmsAndNotifyUserGcmTaskChimeraService, 2131232818));
                asbo f2 = asbo.f(enableMmsAndNotifyUserGcmTaskChimeraService);
                if (f2 != null) {
                    f2.w("com.google.android.backup.g1.notification.mms_enabled.tag", 4, dfee.BACKUP_MMS_BACKUP_ENABLED, c.build());
                }
                ajcn ajcnVar = enableMmsAndNotifyUserGcmTaskChimeraService.b;
                fecj v = ekmk.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                ekmk ekmkVar = (ekmk) v.b;
                ekmkVar.c = 4;
                ekmkVar.b |= 1;
                ekmk ekmkVar2 = (ekmk) v.Q();
                fecj v2 = ekhl.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                ekhl ekhlVar = (ekhl) v2.b;
                ekmkVar2.getClass();
                ekhlVar.ab = ekmkVar2;
                ekhlVar.c |= 134217728;
                ajcnVar.a((ekhl) v2.Q());
                return 0;
            }
        }, enre.a);
    }
}
