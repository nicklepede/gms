package com.google.android.gms.nearby.fastpair.sass.device;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.fastpair.sass.device.SassDevice$1;
import defpackage.ckst;
import defpackage.ekti;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SassDevice$1 extends TracingBroadcastReceiver {
    final /* synthetic */ Executor a;
    public final /* synthetic */ ckst b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SassDevice$1(ckst ckstVar, Executor executor) {
        super("nearby", "ConfigReceiver");
        this.a = executor;
        this.b = ckstVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, final Intent intent) {
        final ArrayList<Integer> integerArrayListExtra;
        if (intent == null || !intent.hasExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_ADDRESS")) {
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_ADDRESS");
        if (TextUtils.isEmpty(stringExtra) || !ekti.e(this.b.b.a.getAddress(), stringExtra)) {
            return;
        }
        if ("com.google.android.gms.nearby.fastpair.sass.device.ACTION_MULTI_POINT_CONFIG_CHANGE_BY_USER".equals(intent.getAction())) {
            if (intent.hasExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_ENABLE_MULTIPOINT")) {
                this.a.execute(new Runnable() { // from class: cksm
                    @Override // java.lang.Runnable
                    public final void run() {
                        eqgl a;
                        final int i = true != intent.getBooleanExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_ENABLE_MULTIPOINT", false) ? 6 : 5;
                        final ckst ckstVar = SassDevice$1.this.b;
                        int b = ckpj.b(ckstVar.d().e);
                        if (b == 0) {
                            b = 2;
                        }
                        if (b == i) {
                            ((eluo) ckstVar.o.d().ai(7103)).B("SassDevice: receiving ACTION_MULTI_POINT_CONFIG_CHANGE_BY_USER to %s, but it's the same as current, ignore", ckpj.a(i));
                            return;
                        }
                        ((eluo) ckstVar.o.d().ai(7102)).B("SassDevice: receiving ACTION_MULTI_POINT_CONFIG_CHANGE_BY_USER to %s", ckpj.a(i));
                        dptf dptfVar = dptf.UNKNOWN;
                        if (i - 1 != 5) {
                            ((eluo) ckstVar.o.d().ai(7148)).x("SassDevice: Update multipoint state to enabled");
                            a = ckstVar.q.a(dppj.EVENT_SET_MULTI_POINT_STATE, dpte.e);
                        } else {
                            ((eluo) ckstVar.o.d().ai(7147)).x("SassDevice: Update multipoint state to disabled");
                            a = ckstVar.q.a(dppj.EVENT_SET_MULTI_POINT_STATE, dpte.f);
                        }
                        ckwc.a(a, new itk() { // from class: ckrs
                            @Override // defpackage.itk
                            public final void a(Object obj) {
                                ckst.this.C(((ckwd) obj).a(), i);
                            }
                        }, ckstVar.e);
                    }
                });
            }
        } else {
            if (!"com.google.android.gms.nearby.fastpair.sass.device.ACTION_SWITCH_PREFERENCE_CHANGE_BY_USER".equals(intent.getAction()) || (integerArrayListExtra = intent.getIntegerArrayListExtra("com.google.android.gms.nearby.fastpair.sass.device.EXTRA_SWITCH_PREFERENCE_LIST")) == null) {
                return;
            }
            this.a.execute(new Runnable() { // from class: cksn
                @Override // java.lang.Runnable
                public final void run() {
                    dppj dppjVar = dppj.EVENT_SET_SWITCH_PREFERENCE;
                    dpsx dpsxVar = new dpsx((short[]) null);
                    ArrayList arrayList = integerArrayListExtra;
                    dpsxVar.D(dptg.A2DP_OVER_A2DP, ((Integer) arrayList.get(0)).intValue());
                    dpsxVar.D(dptg.HFP_OVER_HFP, ((Integer) arrayList.get(1)).intValue());
                    dpsxVar.D(dptg.A2DP_OVER_HFP, ((Integer) arrayList.get(2)).intValue());
                    dpsxVar.D(dptg.HFP_OVER_A2DP, ((Integer) arrayList.get(3)).intValue());
                    byte[] p = dpsxVar.p();
                    final ckst ckstVar = SassDevice$1.this.b;
                    ckwc.a(ckstVar.q.a(dppjVar, p), new itk() { // from class: ckse
                        @Override // defpackage.itk
                        public final void a(Object obj) {
                            ((eluo) ckst.this.o.d().ai(7128)).B("SassDevice: setSeekerSwitchPreference result=%s", ((ckwd) obj).a);
                        }
                    }, ckstVar.e);
                }
            });
        }
    }
}
