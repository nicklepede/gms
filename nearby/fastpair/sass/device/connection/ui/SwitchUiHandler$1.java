package com.google.android.gms.nearby.fastpair.sass.device.connection.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.fastpair.sass.device.connection.ui.SwitchUiHandler$1;
import defpackage.cinh;
import j$.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SwitchUiHandler$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ cinh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchUiHandler$1(cinh cinhVar) {
        super("nearby", "Receiver");
        this.a = cinhVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(final Context context, final Intent intent) {
        this.a.a.execute(new Runnable() { // from class: cinf
            @Override // java.lang.Runnable
            public final void run() {
                final cinh cinhVar = SwitchUiHandler$1.this.a;
                ejhf ejhfVar = (ejhf) cinhVar.u.d().ah(7270);
                Intent intent2 = intent;
                ejhfVar.B("SwitchUiHandler: Received action %s", intent2 == null ? "null" : intent2.getAction());
                if (intent2 == null || TextUtils.isEmpty(intent2.getAction())) {
                    return;
                }
                if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_REVERT_CONNECTION".equals(intent2.getAction())) {
                    cinhVar.g.d(cihi.SASS_EVENT_CODE_REVERT_NOTIFICATION);
                    cinhVar.z = true;
                    Runnable runnable = cinhVar.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    cinhVar.s.a();
                    cinhVar.f();
                    cinhVar.k();
                    cinhVar.b();
                    cinhVar.h();
                    return;
                }
                if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_MOVED_TO_OTHER_DEVICE".equals(intent2.getAction())) {
                    cinhVar.g.d(cihi.SASS_EVENT_CODE_MOVE_TO_OTHER_DEVICE_NOTIFICATION);
                    cinhVar.z = true;
                    Runnable runnable2 = cinhVar.j;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    cinhVar.s.a();
                    cinhVar.d();
                    cinhVar.k();
                    cinhVar.b();
                    cinhVar.h();
                    return;
                }
                if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_SWITCH_FAILED_CLICK".equals(intent2.getAction())) {
                    ciau ciauVar = cinhVar.g;
                    String str = cinhVar.c.e;
                    cihi cihiVar = cihi.SASS_EVENT_CODE_SWITCH_FAILED_NOTIFICATION;
                    ciauVar.j(str, cihiVar);
                    ciauVar.d(cihiVar);
                    Runnable runnable3 = cinhVar.m;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    cinhVar.g();
                    cinhVar.k();
                    return;
                }
                if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_REVERT_FEEDBACK_CLICK".equals(intent2.getAction())) {
                    Context context2 = context;
                    cinhVar.g.d(cihi.SASS_EVENT_CODE_REVERT_FEEDBACK_NOTIFICATION);
                    ScheduledExecutorService scheduledExecutorService = cinhVar.a;
                    Objects.requireNonNull(cinhVar);
                    scheduledExecutorService.execute(new Runnable() { // from class: cine
                        @Override // java.lang.Runnable
                        public final void run() {
                            cinh.this.e();
                        }
                    });
                    cicy.a(context2, "Audio switch failed", cicy.c);
                    return;
                }
                if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_ONBOARD_CLICK".equals(intent2.getAction())) {
                    cinhVar.g.d(cihi.SASS_EVENT_CODE_ONBOARD_NOTIFICATION);
                    cinhVar.n();
                    return;
                }
                if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_OFFBOARD_CLICK".equals(intent2.getAction())) {
                    cinhVar.g.d(cihi.SASS_EVENT_CODE_OFFBOARD_NOTIFICATION);
                    cinhVar.n();
                } else if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_SWITCH_FAILED_TWICE_CLICK".equals(intent2.getAction())) {
                    ciau ciauVar2 = cinhVar.g;
                    String str2 = cinhVar.c.e;
                    cihi cihiVar2 = cihi.SASS_EVENT_CODE_SWITCH_FAILED_TWICE_NOTIFICATION;
                    ciauVar2.j(str2, cihiVar2);
                    ciauVar2.d(cihiVar2);
                    cinhVar.n();
                }
            }
        });
    }
}
