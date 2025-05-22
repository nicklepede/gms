package com.google.android.gms.nearby.fastpair.sass.device.connection.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.fastpair.sass.device.connection.ui.SwitchUiHandler$1;
import defpackage.ckvm;
import j$.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SwitchUiHandler$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ ckvm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchUiHandler$1(ckvm ckvmVar) {
        super("nearby", "Receiver");
        this.a = ckvmVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(final Context context, final Intent intent) {
        this.a.a.execute(new Runnable() { // from class: ckvk
            @Override // java.lang.Runnable
            public final void run() {
                final ckvm ckvmVar = SwitchUiHandler$1.this.a;
                eluo eluoVar = (eluo) ckvmVar.u.d().ai(7219);
                Intent intent2 = intent;
                eluoVar.B("SwitchUiHandler: Received action %s", intent2 == null ? "null" : intent2.getAction());
                if (intent2 == null || TextUtils.isEmpty(intent2.getAction())) {
                    return;
                }
                if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_REVERT_CONNECTION".equals(intent2.getAction())) {
                    ckvmVar.g.d(ckpn.SASS_EVENT_CODE_REVERT_NOTIFICATION);
                    ckvmVar.z = true;
                    Runnable runnable = ckvmVar.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    ckvmVar.s.a();
                    ckvmVar.f();
                    ckvmVar.k();
                    ckvmVar.b();
                    ckvmVar.h();
                    return;
                }
                if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_MOVED_TO_OTHER_DEVICE".equals(intent2.getAction())) {
                    ckvmVar.g.d(ckpn.SASS_EVENT_CODE_MOVE_TO_OTHER_DEVICE_NOTIFICATION);
                    ckvmVar.z = true;
                    Runnable runnable2 = ckvmVar.j;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    ckvmVar.s.a();
                    ckvmVar.d();
                    ckvmVar.k();
                    ckvmVar.b();
                    ckvmVar.h();
                    return;
                }
                if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_SWITCH_FAILED_CLICK".equals(intent2.getAction())) {
                    ckiz ckizVar = ckvmVar.g;
                    String str = ckvmVar.c.e;
                    ckpn ckpnVar = ckpn.SASS_EVENT_CODE_SWITCH_FAILED_NOTIFICATION;
                    ckizVar.j(str, ckpnVar);
                    ckizVar.d(ckpnVar);
                    Runnable runnable3 = ckvmVar.m;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    ckvmVar.g();
                    ckvmVar.k();
                    return;
                }
                if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_REVERT_FEEDBACK_CLICK".equals(intent2.getAction())) {
                    Context context2 = context;
                    ckvmVar.g.d(ckpn.SASS_EVENT_CODE_REVERT_FEEDBACK_NOTIFICATION);
                    ScheduledExecutorService scheduledExecutorService = ckvmVar.a;
                    Objects.requireNonNull(ckvmVar);
                    scheduledExecutorService.execute(new Runnable() { // from class: ckvj
                        @Override // java.lang.Runnable
                        public final void run() {
                            ckvm.this.e();
                        }
                    });
                    ckld.a(context2, "Audio switch failed", ckld.c);
                    return;
                }
                if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_ONBOARD_CLICK".equals(intent2.getAction())) {
                    ckvmVar.g.d(ckpn.SASS_EVENT_CODE_ONBOARD_NOTIFICATION);
                    ckvmVar.n();
                    return;
                }
                if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_OFFBOARD_CLICK".equals(intent2.getAction())) {
                    ckvmVar.g.d(ckpn.SASS_EVENT_CODE_OFFBOARD_NOTIFICATION);
                    ckvmVar.n();
                } else if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_SWITCH_FAILED_TWICE_CLICK".equals(intent2.getAction())) {
                    ckiz ckizVar2 = ckvmVar.g;
                    String str2 = ckvmVar.c.e;
                    ckpn ckpnVar2 = ckpn.SASS_EVENT_CODE_SWITCH_FAILED_TWICE_NOTIFICATION;
                    ckizVar2.j(str2, ckpnVar2);
                    ckizVar2.d(ckpnVar2);
                    ckvmVar.n();
                }
            }
        });
    }
}
