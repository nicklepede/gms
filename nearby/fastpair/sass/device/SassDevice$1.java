package com.google.android.gms.nearby.fastpair.sass.device;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.fastpair.sass.device.SassDevice$1;
import defpackage.ciko;
import defpackage.eigd;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SassDevice$1 extends TracingBroadcastReceiver {
    final /* synthetic */ Executor a;
    public final /* synthetic */ ciko b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SassDevice$1(ciko cikoVar, Executor executor) {
        super("nearby", "ConfigReceiver");
        this.a = executor;
        this.b = cikoVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, final Intent intent) {
        final ArrayList<Integer> integerArrayListExtra;
        if (intent == null || !intent.hasExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_ADDRESS")) {
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_ADDRESS");
        if (TextUtils.isEmpty(stringExtra) || !eigd.e(this.b.b.a.getAddress(), stringExtra)) {
            return;
        }
        if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_MULTI_POINT_CONFIG_CHANGE_BY_USER".equals(intent.getAction())) {
            if (intent.hasExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_ENABLE_MULTIPOINT")) {
                this.a.execute(new Runnable() { // from class: cikh
                    @Override // java.lang.Runnable
                    public final void run() {
                        enss a;
                        final int i = true != intent.getBooleanExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_ENABLE_MULTIPOINT", false) ? 6 : 5;
                        final ciko cikoVar = SassDevice$1.this.b;
                        int b = cihe.b(cikoVar.d().e);
                        if (b == 0) {
                            b = 2;
                        }
                        if (b == i) {
                            ((ejhf) cikoVar.o.d().ah(7154)).B("SassDevice: receiving ACTION_MULTI_POINT_CONFIG_CHANGE_BY_USER to %s, but it's the same as current, ignore", cihe.a(i));
                            return;
                        }
                        ((ejhf) cikoVar.o.d().ah(7153)).B("SassDevice: receiving ACTION_MULTI_POINT_CONFIG_CHANGE_BY_USER to %s", cihe.a(i));
                        dniw dniwVar = dniw.UNKNOWN;
                        if (i - 1 != 5) {
                            ((ejhf) cikoVar.o.d().ah(7199)).x("SassDevice: Update multipoint state to enabled");
                            a = cikoVar.q.a(dnfa.EVENT_SET_MULTI_POINT_STATE, dniv.e);
                        } else {
                            ((ejhf) cikoVar.o.d().ah(7198)).x("SassDevice: Update multipoint state to disabled");
                            a = cikoVar.q.a(dnfa.EVENT_SET_MULTI_POINT_STATE, dniv.f);
                        }
                        cinx.a(a, new iru() { // from class: cijn
                            @Override // defpackage.iru
                            public final void a(Object obj) {
                                ciko.this.C(((ciny) obj).a(), i);
                            }
                        }, cikoVar.e);
                    }
                });
            }
        } else {
            if (!"com.google.android.gms.nearby.fastpair.sass.device.ACTION_SWITCH_PREFERENCE_CHANGE_BY_USER".equals(intent.getAction()) || (integerArrayListExtra = intent.getIntegerArrayListExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_SWITCH_PREFERENCE_LIST")) == null) {
                return;
            }
            this.a.execute(new Runnable() { // from class: ciki
                @Override // java.lang.Runnable
                public final void run() {
                    dnfa dnfaVar = dnfa.EVENT_SET_SWITCH_PREFERENCE;
                    dnio dnioVar = new dnio((short[]) null);
                    ArrayList arrayList = integerArrayListExtra;
                    dnioVar.D(dnix.A2DP_OVER_A2DP, ((Integer) arrayList.get(0)).intValue());
                    dnioVar.D(dnix.HFP_OVER_HFP, ((Integer) arrayList.get(1)).intValue());
                    dnioVar.D(dnix.A2DP_OVER_HFP, ((Integer) arrayList.get(2)).intValue());
                    dnioVar.D(dnix.HFP_OVER_A2DP, ((Integer) arrayList.get(3)).intValue());
                    byte[] p = dnioVar.p();
                    final ciko cikoVar = SassDevice$1.this.b;
                    cinx.a(cikoVar.q.a(dnfaVar, p), new iru() { // from class: cijz
                        @Override // defpackage.iru
                        public final void a(Object obj) {
                            ((ejhf) ciko.this.o.d().ah(7179)).B("SassDevice: setSeekerSwitchPreference result=%s", ((ciny) obj).a);
                        }
                    }, cikoVar.e);
                }
            });
        }
    }
}
