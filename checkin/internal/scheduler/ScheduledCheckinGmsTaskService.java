package com.google.android.gms.checkin.internal.scheduler;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.WakefulBroadcastReceiver;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ansq;
import defpackage.antd;
import defpackage.arxo;
import defpackage.byln;
import defpackage.deqy;
import defpackage.fmdv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ScheduledCheckinGmsTaskService extends GmsTaskBoundService {
    public static final arxo a = antd.a("ScheduledCheckinGmsTaskService");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        arxo arxoVar = a;
        arxoVar.h("onRunTask", new Object[0]);
        if (!fmdv.d()) {
            arxoVar.d("GmsTask scheduling disabled", new Object[0]);
            return 0;
        }
        Bundle bundle = bylnVar.b;
        if (bundle == null) {
            arxoVar.m("Unexpected task with null checkinConfigs", new Object[0]);
            return 2;
        }
        Intent a2 = ansq.a(this, bundle);
        int i = deqy.c;
        WakefulBroadcastReceiver.startWakefulService(this, a2);
        return 0;
    }
}
