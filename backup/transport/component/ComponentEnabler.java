package com.google.android.gms.backup.transport.component;

import android.content.Intent;
import com.google.android.gms.backup.settings.notifications.PhotosBackupMissingPermissionNotificationTask;
import com.google.android.gms.backup.transport.snapshot.DeviceStateSnapshotLoggingTask;
import defpackage.ahwd;
import defpackage.aieg;
import defpackage.ajsu;
import defpackage.akdz;
import defpackage.akea;
import defpackage.akeb;
import defpackage.akec;
import defpackage.aked;
import defpackage.akee;
import defpackage.akef;
import defpackage.akkv;
import defpackage.anya;
import defpackage.arxo;
import defpackage.byjl;
import defpackage.byko;
import defpackage.bykv;
import defpackage.eiuu;
import defpackage.ejfg;
import defpackage.fllt;
import defpackage.flly;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ComponentEnabler extends anya {
    private static final ahwd a = new ahwd("ComponentEnabler");
    private final eiuu b = eiuu.O(new akdz(), new akef(), new akee(), new aked(), new akec(), new akeb(), new akea[0]);

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        aieg aiegVar = new aieg(this);
        ahwd ahwdVar = a;
        ahwdVar.j("Enabling components", new Object[0]);
        ejfg listIterator = this.b.listIterator();
        while (listIterator.hasNext()) {
            ((akea) listIterator.next()).a(this, aiegVar);
        }
        ahwdVar.j("Scheduling tasks.", new Object[0]);
        GmsBackupSchedulerChimeraService.c(this);
        MmsBackupSchedulerChimeraService.b(this);
        if (fllt.a.a().L()) {
            OnlyRunCustomBackupTask.d(this);
        }
        CustomBackupNewScheduleLoggingTask.d(this);
        arxo arxoVar = DeviceStateSnapshotLoggingTask.a;
        byko bykoVar = new byko();
        bykoVar.w("com.google.android.gms.backup.transport.snapshot.DeviceStateSnapshotLoggingTask");
        bykoVar.t("device_state_snapshot_logging");
        bykoVar.v(2);
        bykoVar.a = bykv.j;
        bykoVar.l(true);
        bykoVar.e();
        bykoVar.p = true;
        byjl.a(this).f(bykoVar.b());
        DeviceStateSnapshotLoggingTask.a.j("Task is scheduled to run", new Object[0]);
        int i2 = akkv.a;
        akkv.a(this);
        arxo arxoVar2 = PhotosBackupMissingPermissionNotificationTask.a;
        if (!ajsu.a()) {
            PhotosBackupMissingPermissionNotificationTask.a.j("Not scheduling task, flag is disabled or device is wearable.", new Object[0]);
            return;
        }
        bykv e = bykv.e((int) flly.a.a().a());
        fvbo.e(e, "fromInteger(...)");
        byko bykoVar2 = new byko();
        bykoVar2.w("com.google.android.gms.backup.settings.notifications.PhotosBackupMissingPermissionNotificationTask");
        bykoVar2.t("photos_backup_missing_permission_notification");
        bykoVar2.a = e;
        bykoVar2.l(false);
        bykoVar2.v(2);
        bykoVar2.p = true;
        byjl.a(this).f(bykoVar2.b());
        PhotosBackupMissingPermissionNotificationTask.a.j("Photos backup missing permission notification task scheduled.", new Object[0]);
    }
}
