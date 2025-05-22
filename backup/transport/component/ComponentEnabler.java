package com.google.android.gms.backup.transport.component;

import android.content.Intent;
import com.google.android.gms.backup.settings.notifications.PhotosBackupMissingPermissionNotificationTask;
import com.google.android.gms.backup.transport.snapshot.DeviceStateSnapshotLoggingTask;
import defpackage.ajwt;
import defpackage.akew;
import defpackage.altn;
import defpackage.amew;
import defpackage.amex;
import defpackage.amey;
import defpackage.amez;
import defpackage.amfa;
import defpackage.amfb;
import defpackage.amfc;
import defpackage.amly;
import defpackage.apzs;
import defpackage.auad;
import defpackage.casd;
import defpackage.catg;
import defpackage.catn;
import defpackage.elhz;
import defpackage.elsn;
import defpackage.fodd;
import defpackage.fodi;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ComponentEnabler extends apzs {
    private static final ajwt a = new ajwt("ComponentEnabler");
    private final elhz b = elhz.O(new amew(), new amfc(), new amfb(), new amfa(), new amez(), new amey(), new amex[0]);

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        akew akewVar = new akew(this);
        ajwt ajwtVar = a;
        ajwtVar.j("Enabling components", new Object[0]);
        elsn listIterator = this.b.listIterator();
        while (listIterator.hasNext()) {
            ((amex) listIterator.next()).a(this, akewVar);
        }
        ajwtVar.j("Scheduling tasks.", new Object[0]);
        GmsBackupSchedulerChimeraService.c(this);
        MmsBackupSchedulerChimeraService.b(this);
        if (fodd.a.lK().L()) {
            OnlyRunCustomBackupTask.d(this);
        }
        CustomBackupNewScheduleLoggingTask.d(this);
        auad auadVar = DeviceStateSnapshotLoggingTask.a;
        catg catgVar = new catg();
        catgVar.w("com.google.android.gms.backup.transport.snapshot.DeviceStateSnapshotLoggingTask");
        catgVar.t("device_state_snapshot_logging");
        catgVar.v(2);
        catgVar.a = catn.j;
        catgVar.l(true);
        catgVar.e();
        catgVar.p = true;
        casd.a(this).f(catgVar.b());
        DeviceStateSnapshotLoggingTask.a.j("Task is scheduled to run", new Object[0]);
        int i2 = amly.a;
        amly.a(this);
        auad auadVar2 = PhotosBackupMissingPermissionNotificationTask.a;
        if (!altn.a()) {
            PhotosBackupMissingPermissionNotificationTask.a.j("Not scheduling task, flag is disabled or device is wearable.", new Object[0]);
            return;
        }
        catn e = catn.e((int) fodi.a.lK().a());
        fxxm.e(e, "fromInteger(...)");
        catg catgVar2 = new catg();
        catgVar2.w("com.google.android.gms.backup.settings.notifications.PhotosBackupMissingPermissionNotificationTask");
        catgVar2.t("photos_backup_missing_permission_notification");
        catgVar2.a = e;
        catgVar2.l(false);
        catgVar2.v(2);
        catgVar2.p = true;
        casd.a(this).f(catgVar2.b());
        PhotosBackupMissingPermissionNotificationTask.a.j("Photos backup missing permission notification task scheduled.", new Object[0]);
    }
}
