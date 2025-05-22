package com.google.android.gms.time.platformfeedback;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ServiceDumpRequest;
import com.google.android.gms.time.platformfeedback.PlatformFeedbackLaunchChimeraActivity;
import defpackage.atad;
import defpackage.bcnd;
import defpackage.bcoj;
import defpackage.bcpl;
import defpackage.bsup;
import defpackage.dhlk;
import defpackage.diog;
import defpackage.dioj;
import defpackage.dxfp;
import defpackage.dxfs;
import defpackage.eluo;
import defpackage.fvir;
import defpackage.ryt;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class PlatformFeedbackLaunchChimeraActivity extends ryt {
    private static final dxfp j = new dxfs(PlatformFeedbackLaunchChimeraActivity.class);
    private static final String[] k = {"--feedback"};
    private boolean l;
    private diog m;

    public PlatformFeedbackLaunchChimeraActivity() {
        this(new diog() { // from class: dioh
            @Override // defpackage.diog
            public final Object a(Context context) {
                aszs aszsVar = bcld.a;
                return new atad(context, (int[][]) null);
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

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fvir.c()) {
            ((eluo) ((eluo) dioj.a.j()).ai(11392)).B("%s Platform Feedback feature is disabled", j);
            a();
            return;
        }
        Intent intent = getIntent();
        if (intent == null) {
            ((eluo) ((eluo) dioj.a.j()).ai(11391)).B("%s No intent found", j);
            a();
        } else if (Objects.equals(intent.getAction(), "com.google.android.gms.time.platformfeedback.LAUNCH_USER_FEEDBACK")) {
            ((eluo) dioj.a.f(Level.INFO).ai(11389)).x("Activity intent received. onCreate");
        } else {
            ((eluo) ((eluo) dioj.a.j()).ai(11390)).P("%s Unexpected action received %s", j, intent.getAction());
            a();
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        if (!this.l && fvir.c()) {
            Account[] p = bsup.b(this).p("com.google");
            String str = null;
            if (p != null && p.length != 0) {
                str = p[0].name;
            }
            String str2 = (String) Objects.requireNonNullElse(str, "anonymous");
            Object a = this.m.a(this);
            bcoj bcojVar = new bcoj();
            bcojVar.a = "*";
            bcojVar.c = true;
            bcojVar.b = true;
            bcojVar.b();
            bcpl bcplVar = new bcpl();
            bcplVar.a = "time_detector";
            bcplVar.b = "time_detector";
            String[] strArr = k;
            bcplVar.c = strArr;
            bcplVar.b();
            bcplVar.c();
            bcpl bcplVar2 = new bcpl();
            bcplVar2.a = "time_zone_detector";
            bcplVar2.b = "time_zone_detector";
            bcplVar2.c = strArr;
            bcplVar2.b();
            bcplVar2.c();
            bcpl bcplVar3 = new bcpl();
            bcplVar3.a = "com.android.phone/.TelephonyDebugService";
            bcplVar3.b = "activity";
            bcplVar3.c = b("com.android.phone/.TelephonyDebugService");
            bcplVar3.b();
            bcplVar3.c();
            bcpl bcplVar4 = new bcpl();
            bcplVar4.a = "GeoTimeZoneService";
            bcplVar4.b = "activity";
            bcplVar4.c = b("GeoTimeZoneService");
            bcplVar4.b();
            bcplVar4.c();
            bcojVar.d = new ServiceDumpRequest[]{bcplVar.a(), bcplVar2.a(), bcplVar3.a(), bcplVar4.a()};
            LogOptions a2 = bcojVar.a();
            String string = getString(R.string.platform_feedback_description);
            bcnd bcndVar = new bcnd(this);
            bcndVar.g = a2;
            bcndVar.d = string;
            bcndVar.e = "com.google.android.gms.time.PLATFORM_FEEDBACK";
            bcndVar.b = str2;
            ((atad) a).aa(bcndVar.a()).p(this, new dhlk() { // from class: dioi
                @Override // defpackage.dhlk
                public final void hH(dhlw dhlwVar) {
                    PlatformFeedbackLaunchChimeraActivity.this.a();
                }
            });
        }
    }

    private PlatformFeedbackLaunchChimeraActivity(diog diogVar) {
        this.l = false;
        this.m = (diog) Objects.requireNonNull(diogVar);
    }
}
