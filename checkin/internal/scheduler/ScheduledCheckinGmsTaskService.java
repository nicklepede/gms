package com.google.android.gms.checkin.internal.scheduler;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.WakefulBroadcastReceiver;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.apui;
import defpackage.apuv;
import defpackage.auad;
import defpackage.cauf;
import defpackage.dhcb;
import defpackage.fovh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ScheduledCheckinGmsTaskService extends GmsTaskBoundService {
    public static final auad a = apuv.a("ScheduledCheckinGmsTaskService");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        auad auadVar = a;
        auadVar.h("onRunTask", new Object[0]);
        if (!fovh.d()) {
            auadVar.d("GmsTask scheduling disabled", new Object[0]);
            return 0;
        }
        Bundle bundle = caufVar.b;
        if (bundle == null) {
            auadVar.m("Unexpected task with null checkinConfigs", new Object[0]);
            return 2;
        }
        Intent a2 = apui.a(this, bundle);
        int i = dhcb.c;
        WakefulBroadcastReceiver.startWakefulService(this, a2);
        return 0;
    }
}
