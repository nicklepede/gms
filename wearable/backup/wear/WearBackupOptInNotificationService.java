package com.google.android.gms.wearable.backup.wear;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import com.google.android.gms.R;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInNotificationService;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;
import defpackage.ajql;
import defpackage.auad;
import defpackage.bzoo;
import defpackage.cauf;
import defpackage.dlxc;
import defpackage.dokt;
import defpackage.dznn;
import defpackage.dzno;
import defpackage.dzti;
import defpackage.dztj;
import defpackage.dztm;
import defpackage.dzwm;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WearBackupOptInNotificationService extends GmsTaskBoundService {
    public static final auad a = new dlxc("OptInNotificationService");

    public static dzwm d(Context context) {
        dztm dztmVar = bzoo.a;
        dzti a2 = dztj.a();
        Pattern pattern = dzno.a;
        dznn dznnVar = new dznn(context);
        dznnVar.e("wearable");
        dznnVar.f("wear_backup_opt_in_notification.pb");
        a2.f(dznnVar.a());
        a2.e(dokt.a);
        return dztmVar.a(a2.a());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        auad auadVar = a;
        auadVar.d("onRunTaskAsync", new Object[0]);
        boolean j = new ajql(this).j();
        auadVar.d("isBackupEnabled=%b", Boolean.valueOf(j));
        if (j) {
            auadVar.j("Backup is already enabled, not showing notification", new Object[0]);
            return eqgc.i(0);
        }
        auadVar.d("Notification disabled: device is not wearable", new Object[0]);
        return eqdl.g(eqgc.i(false), new eqdv() { // from class: dmib
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    WearBackupOptInNotificationService.a.d("Disabled, not running", new Object[0]);
                    return eqgc.i(2);
                }
                final WearBackupOptInNotificationService wearBackupOptInNotificationService = WearBackupOptInNotificationService.this;
                aued f = aued.f(wearBackupOptInNotificationService);
                if (f == null) {
                    WearBackupOptInNotificationService.a.f("Unable to send notifications: notificationManager is null", new Object[0]);
                    return eqgc.i(2);
                }
                WearBackupOptInNotificationService.a.d("Showing opt-in notification", new Object[0]);
                Notification.Builder addAction = dmdw.a(wearBackupOptInNotificationService).setContentTitle(wearBackupOptInNotificationService.getText(R.string.wear_backup_opt_in_notification_title)).setContentText(wearBackupOptInNotificationService.getText(R.string.wear_backup_opt_in_notification_text)).setAutoCancel(false).addAction(new Notification.Action.Builder((Icon) null, wearBackupOptInNotificationService.getText(R.string.common_turn_on), dmdw.b(wearBackupOptInNotificationService, WearBackupSettingsChimeraActivity.b().putExtra("enable_backup_from_notification", true))).build());
                if (fwbj.e()) {
                    new imt(wearBackupOptInNotificationService).c("com.google.android.backup.notification.wear_backup_opt_in.tag", 2, addAction.build());
                } else {
                    addAction.setContentIntent(dmdw.b(wearBackupOptInNotificationService, WearBackupOptInChimeraActivity.a(null)));
                    f.w("com.google.android.backup.notification.wear_backup_opt_in.tag", 2, dhpk.WEARABLE_BACKUP_OPT_IN, addAction.build());
                }
                final AtomicReference atomicReference = new AtomicReference();
                dzwm d = WearBackupOptInNotificationService.d(wearBackupOptInNotificationService);
                ekut ekutVar = new ekut() { // from class: dmic
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        dokt doktVar = (dokt) obj2;
                        auad auadVar2 = WearBackupOptInNotificationService.a;
                        fgrc v = dokt.a.v();
                        fgub h = fgvq.h(System.currentTimeMillis());
                        if (!v.b.L()) {
                            v.U();
                        }
                        fgri fgriVar = v.b;
                        dokt doktVar2 = (dokt) fgriVar;
                        h.getClass();
                        doktVar2.c = h;
                        doktVar2.b |= 1;
                        long j2 = doktVar.d + 1;
                        if (!fgriVar.L()) {
                            v.U();
                        }
                        AtomicReference atomicReference2 = atomicReference;
                        dokt doktVar3 = (dokt) v.b;
                        doktVar3.b |= 2;
                        doktVar3.d = j2;
                        dokt doktVar4 = (dokt) v.Q();
                        atomicReference2.set(doktVar4);
                        return doktVar4;
                    }
                };
                eqex eqexVar = eqex.a;
                return eqdl.f(eqgb.h(eqdl.f(d.b(ekutVar, eqexVar), new ekut() { // from class: dmid
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        auad auadVar2 = WearBackupOptInNotificationService.a;
                        return (dokt) atomicReference.get();
                    }
                }, eqexVar)), new ekut() { // from class: dmif
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        int i = (int) ((dokt) obj2).d;
                        fwbj fwbjVar = fwbj.a;
                        if (i < fwbjVar.lK().g()) {
                            List n = ekwo.g(";").n(fwbjVar.lK().i());
                            auad auadVar2 = WearBackupOptInNotificationService.a;
                            auadVar2.j("Current back off values: %s", n);
                            String str = i < n.size() ? (String) n.get(eqbm.a(r3) - 1) : (String) elja.p(n);
                            WearBackupOptInNotificationService wearBackupOptInNotificationService2 = WearBackupOptInNotificationService.this;
                            long f2 = fwbjVar.lK().f() + Long.parseLong(str);
                            long h = fwbjVar.lK().h();
                            auadVar2.h("Scheduling opt-in notification task with %d seconds delay", Long.valueOf(f2));
                            casd a2 = casd.a(wearBackupOptInNotificationService2);
                            catb catbVar = new catb();
                            catbVar.t("wear_backup_opt_in_notification_service");
                            catbVar.p = true;
                            catbVar.v(1);
                            catbVar.w("com.google.android.gms.wearable.backup.wear.WearBackupOptInNotificationService");
                            catbVar.e(f2, h + f2);
                            a2.f(catbVar.b());
                        }
                        return 0;
                    }
                }, eqexVar);
            }
        }, eqex.a);
    }
}
