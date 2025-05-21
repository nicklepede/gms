package com.google.android.gms.time.platformfeedback;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ServiceDumpRequest;
import com.google.android.gms.time.platformfeedback.PlatformFeedbackLaunchChimeraActivity;
import defpackage.aqxo;
import defpackage.bajh;
import defpackage.bakn;
import defpackage.balp;
import defpackage.bqna;
import defpackage.dfae;
import defpackage.dgdb;
import defpackage.dgde;
import defpackage.duut;
import defpackage.duuw;
import defpackage.ejhf;
import defpackage.fsnh;
import defpackage.qfp;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class PlatformFeedbackLaunchChimeraActivity extends qfp {
    private static final duut j = new duuw(PlatformFeedbackLaunchChimeraActivity.class);
    private static final String[] k = {"--feedback"};
    private boolean l;
    private dgdb m;

    public PlatformFeedbackLaunchChimeraActivity() {
        this(new dgdb() { // from class: dgdc
            @Override // defpackage.dgdb
            public final Object a(Context context) {
                aqxd aqxdVar = bahh.a;
                return new aqxo(context, (int[][]) null);
            }
        });
    }

    private static String[] b(String str) {
        String[] strArr = k;
        int length = strArr.length;
        ArrayList arrayList = new ArrayList(3);
        Collections.addAll(arrayList, "service", str);
        Collections.addAll(arrayList, strArr);
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final void a() {
        this.l = true;
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fsnh.c()) {
            ((ejhf) ((ejhf) dgde.a.j()).ah(11389)).B("%s Platform Feedback feature is disabled", j);
            a();
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            ((ejhf) ((ejhf) dgde.a.j()).ah(11388)).B("%s No intent found", j);
            a();
        } else if (Objects.equals(intent.getAction(), "com.google.android.gms.time.platformfeedback.LAUNCH_USER_FEEDBACK")) {
            ((ejhf) dgde.a.f(Level.INFO).ah(11386)).x("Activity intent received. onCreate");
        } else {
            ((ejhf) ((ejhf) dgde.a.j()).ah(11387)).P("%s Unexpected action received %s", j, intent.getAction());
            a();
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        if (!this.l && fsnh.c()) {
            Account[] p = bqna.b(this).p("com.google");
            String str = null;
            if (p != null && p.length != 0) {
                str = p[0].name;
            }
            String str2 = (String) Objects.requireNonNullElse(str, "anonymous");
            Object a = this.m.a(this);
            bakn baknVar = new bakn();
            baknVar.a = "*";
            baknVar.c = true;
            baknVar.b = true;
            baknVar.b();
            balp balpVar = new balp();
            balpVar.a = "time_detector";
            balpVar.b = "time_detector";
            String[] strArr = k;
            balpVar.c = strArr;
            balpVar.b();
            balpVar.c();
            balp balpVar2 = new balp();
            balpVar2.a = "time_zone_detector";
            balpVar2.b = "time_zone_detector";
            balpVar2.c = strArr;
            balpVar2.b();
            balpVar2.c();
            balp balpVar3 = new balp();
            balpVar3.a = "com.android.phone/.TelephonyDebugService";
            balpVar3.b = "activity";
            balpVar3.c = b("com.android.phone/.TelephonyDebugService");
            balpVar3.b();
            balpVar3.c();
            balp balpVar4 = new balp();
            balpVar4.a = "GeoTimeZoneService";
            balpVar4.b = "activity";
            balpVar4.c = b("GeoTimeZoneService");
            balpVar4.b();
            balpVar4.c();
            baknVar.d = new ServiceDumpRequest[]{balpVar.a(), balpVar2.a(), balpVar3.a(), balpVar4.a()};
            LogOptions a2 = baknVar.a();
            String string = getString(R.string.platform_feedback_description);
            bajh bajhVar = new bajh(this);
            bajhVar.g = a2;
            bajhVar.d = string;
            bajhVar.e = "com.google.android.gms.time.PLATFORM_FEEDBACK";
            bajhVar.b = str2;
            ((aqxo) a).aa(bajhVar.a()).p(this, new dfae() { // from class: dgdd
                @Override // defpackage.dfae
                public final void hr(dfaq dfaqVar) {
                    PlatformFeedbackLaunchChimeraActivity.this.a();
                }
            });
        }
    }

    private PlatformFeedbackLaunchChimeraActivity(dgdb dgdbVar) {
        this.l = false;
        this.m = (dgdb) Objects.requireNonNull(dgdbVar);
    }
}
