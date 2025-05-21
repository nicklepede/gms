package com.google.android.gms.auth.uiflows.addaccount;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.addaccount.ErrorChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.setupcompat.logging.SetupMetric;
import defpackage.aand;
import defpackage.aane;
import defpackage.aanh;
import defpackage.addu;
import defpackage.adjh;
import defpackage.adlg;
import defpackage.arkc;
import defpackage.asoe;
import defpackage.asop;
import defpackage.asqh;
import defpackage.eddl;
import defpackage.eddr;
import defpackage.fkdk;
import defpackage.fknk;
import defpackage.vcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ErrorChimeraActivity extends adlg implements aand {
    private aane h;

    public static int j(boolean z) {
        return (z || asop.c(fknk.b())) ? 0 : 4;
    }

    private final CharSequence l() {
        return (CharSequence) s().a(adjh.e);
    }

    @Override // defpackage.aand
    public final void b() {
        gD(-1, null);
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "ErrorActivity";
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        super.onBackPressed();
        gD(0, null);
    }

    @Override // defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (vcw.a.a(this)) {
            if (((Boolean) s().b(adjh.g, false)).booleanValue() && asqh.e()) {
                gD(0, new Intent().putExtra("ERROR_OCCURRED", true));
                return;
            }
            setTheme(R.style.TvMinuteMaidOpaque);
            setContentView(LayoutInflater.from(this).inflate(R.layout.auth_tv_glif_error_activity, (ViewGroup) null));
            ((TextView) findViewById(R.id.title)).setText((CharSequence) s().a(adjh.d));
            ((TextView) findViewById(R.id.message)).setText(l());
            TextView textView = (TextView) findViewById(R.id.button);
            textView.setText(R.string.auth_device_management_go_back);
            textView.setOnClickListener(new View.OnClickListener() { // from class: ades
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ErrorChimeraActivity.this.gD(0, null);
                }
            });
            return;
        }
        String str = t().a;
        boolean z = str != null && arkc.i(str);
        if (z && (fkdk.e() || asoe.l(this))) {
            this.h = (aane) LayoutInflater.from(this).inflate(true != asop.c(fkdk.b()) ? R.layout.auth_generic_suw_glif_activity_v2 : R.layout.auth_generic_suw_non_loading_glif, (ViewGroup) null, false);
        } else {
            this.h = (aane) LayoutInflater.from(this).inflate(true != z ? R.layout.auth_generic_suw_activity : R.layout.auth_generic_suw_glif_activity, (ViewGroup) null, false);
        }
        arkc.e((ViewGroup) this.h);
        this.q = (aanh) this.h;
        this.h.b((String) s().a(adjh.d));
        this.h.e(l());
        Integer num = (Integer) s().a(adjh.f);
        if (num != null) {
            this.h.a(num.intValue() == 0);
        }
        this.h.d(this);
        Controller controller = this.v;
        String format = controller == null ? "AuthErrors" : String.format("Auth%sErrors", controller.b());
        Intent intent = getIntent();
        int i = addu.a;
        int i2 = this.w;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("error", i2);
        bundle2.putLong("timestamp", eddl.a());
        new SetupMetric(format, 6, eddr.b(bundle2));
        addu.a(intent);
        setContentView((View) this.h);
    }
}
