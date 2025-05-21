package com.google.android.gms.wearable.backup.wear;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import com.google.android.gms.R;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInNotificationService;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;
import defpackage.ahpv;
import defpackage.arxo;
import defpackage.bxfy;
import defpackage.byln;
import defpackage.djlj;
import defpackage.dlzh;
import defpackage.dxbn;
import defpackage.dxbo;
import defpackage.dxhi;
import defpackage.dxhj;
import defpackage.dxhm;
import defpackage.dxkm;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WearBackupOptInNotificationService extends GmsTaskBoundService {
    public static final arxo a = new djlj("OptInNotificationService");

    public static dxkm d(Context context) {
        dxhm dxhmVar = bxfy.a;
        dxhi a2 = dxhj.a();
        Pattern pattern = dxbo.a;
        dxbn dxbnVar = new dxbn(context);
        dxbnVar.e("wearable");
        dxbnVar.f("wear_backup_opt_in_notification.pb");
        a2.f(dxbnVar.a());
        a2.e(dlzh.a);
        return dxhmVar.a(a2.a());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        arxo arxoVar = a;
        arxoVar.d("onRunTaskAsync", new Object[0]);
        boolean k = new ahpv(this).k();
        arxoVar.d("isBackupEnabled=%b", Boolean.valueOf(k));
        if (k) {
            arxoVar.j("Backup is already enabled, not showing notification", new Object[0]);
            return ensj.i(0);
        }
        arxoVar.d("Notification disabled: device is not wearable", new Object[0]);
        return enps.g(ensj.i(false), new enqc() { // from class: djwi
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    WearBackupOptInNotificationService.a.d("Disabled, not running", new Object[0]);
                    return ensj.i(2);
                }
                final WearBackupOptInNotificationService wearBackupOptInNotificationService = WearBackupOptInNotificationService.this;
                asbo f = asbo.f(wearBackupOptInNotificationService);
                if (f == null) {
                    WearBackupOptInNotificationService.a.f("Unable to send notifications: notificationManager is null", new Object[0]);
                    return ensj.i(2);
                }
                WearBackupOptInNotificationService.a.d("Showing opt-in notification", new Object[0]);
                Notification.Builder addAction = djsd.a(wearBackupOptInNotificationService).setContentTitle(wearBackupOptInNotificationService.getText(R.string.wear_backup_opt_in_notification_title)).setContentText(wearBackupOptInNotificationService.getText(R.string.wear_backup_opt_in_notification_text)).setAutoCancel(false).addAction(new Notification.Action.Builder((Icon) null, wearBackupOptInNotificationService.getText(R.string.common_turn_on), djsd.b(wearBackupOptInNotificationService, WearBackupSettingsChimeraActivity.b().putExtra("enable_backup_from_notification", true))).build());
                if (ftfu.e()) {
                    new ild(wearBackupOptInNotificationService).c("com.google.android.backup.notification.wear_backup_opt_in.tag", 2, addAction.build());
                } else {
                    addAction.setContentIntent(djsd.b(wearBackupOptInNotificationService, WearBackupOptInChimeraActivity.a(null)));
                    f.w("com.google.android.backup.notification.wear_backup_opt_in.tag", 2, dfee.WEARABLE_BACKUP_OPT_IN, addAction.build());
                }
                final AtomicReference atomicReference = new AtomicReference();
                dxkm d = WearBackupOptInNotificationService.d(wearBackupOptInNotificationService);
                eiho eihoVar = new eiho() { // from class: djwj
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        dlzh dlzhVar = (dlzh) obj2;
                        arxo arxoVar2 = WearBackupOptInNotificationService.a;
                        fecj v = dlzh.a.v();
                        fefi h = fegx.h(System.currentTimeMillis());
                        if (!v.b.L()) {
                            v.U();
                        }
                        fecp fecpVar = v.b;
                        dlzh dlzhVar2 = (dlzh) fecpVar;
                        h.getClass();
                        dlzhVar2.c = h;
                        dlzhVar2.b |= 1;
                        long j = dlzhVar.d + 1;
                        if (!fecpVar.L()) {
                            v.U();
                        }
                        AtomicReference atomicReference2 = atomicReference;
                        dlzh dlzhVar3 = (dlzh) v.b;
                        dlzhVar3.b |= 2;
                        dlzhVar3.d = j;
                        dlzh dlzhVar4 = (dlzh) v.Q();
                        atomicReference2.set(dlzhVar4);
                        return dlzhVar4;
                    }
                };
                enre enreVar = enre.a;
                return enps.f(ensi.h(enps.f(d.b(eihoVar, enreVar), new eiho() { // from class: djwk
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        arxo arxoVar2 = WearBackupOptInNotificationService.a;
                        return (dlzh) atomicReference.get();
                    }
                }, enreVar)), new eiho() { // from class: djwm
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        int i = (int) ((dlzh) obj2).d;
                        ftfu ftfuVar = ftfu.a;
                        if (i < ftfuVar.a().g()) {
                            List n = eijj.g(";").n(ftfuVar.a().i());
                            arxo arxoVar2 = WearBackupOptInNotificationService.a;
                            arxoVar2.j("Current back off values: %s", n);
                            String str = i < n.size() ? (String) n.get(ennt.a(r3) - 1) : (String) eivv.p(n);
                            WearBackupOptInNotificationService wearBackupOptInNotificationService2 = WearBackupOptInNotificationService.this;
                            long f2 = ftfuVar.a().f() + Long.parseLong(str);
                            long h = ftfu.a.a().h();
                            arxoVar2.h("Scheduling opt-in notification task with %d seconds delay", Long.valueOf(f2));
                            byjl a2 = byjl.a(wearBackupOptInNotificationService2);
                            bykj bykjVar = new bykj();
                            bykjVar.t("wear_backup_opt_in_notification_service");
                            bykjVar.p = true;
                            bykjVar.v(1);
                            bykjVar.w("com.google.android.gms.wearable.backup.wear.WearBackupOptInNotificationService");
                            bykjVar.e(f2, h + f2);
                            a2.f(bykjVar.b());
                        }
                        return 0;
                    }
                }, enreVar);
            }
        }, enre.a);
    }
}
