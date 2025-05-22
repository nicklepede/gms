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
import defpackage.acnd;
import defpackage.acne;
import defpackage.acnh;
import defpackage.afdw;
import defpackage.afjo;
import defpackage.afln;
import defpackage.atmr;
import defpackage.aury;
import defpackage.ausj;
import defpackage.auub;
import defpackage.efqg;
import defpackage.efqm;
import defpackage.fmtw;
import defpackage.fndz;
import defpackage.wyw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ErrorChimeraActivity extends afln implements acnd {
    private acne h;

    public static int j(boolean z) {
        return (z || ausj.c(fndz.b())) ? 0 : 4;
    }

    private final CharSequence l() {
        return (CharSequence) s().a(afjo.e);
    }

    @Override // defpackage.acnd
    public final void b() {
        gT(-1, null);
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "ErrorActivity";
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        super.onBackPressed();
        gT(0, null);
    }

    @Override // defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (wyw.a.a(this)) {
            if (((Boolean) s().b(afjo.g, false)).booleanValue() && auub.e()) {
                gT(0, new Intent().putExtra("ERROR_OCCURRED", true));
                return;
            }
            setTheme(R.style.TvMinuteMaidOpaque);
            setContentView(LayoutInflater.from(this).inflate(R.layout.auth_tv_glif_error_activity, (ViewGroup) null));
            ((TextView) findViewById(R.id.title)).setText((CharSequence) s().a(afjo.d));
            ((TextView) findViewById(R.id.message)).setText(l());
            TextView textView = (TextView) findViewById(R.id.button);
            textView.setText(R.string.auth_device_management_go_back);
            textView.setOnClickListener(new View.OnClickListener() { // from class: afeu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ErrorChimeraActivity.this.gT(0, null);
                }
            });
            return;
        }
        String str = t().a;
        boolean z = str != null && atmr.i(str);
        if (z && (fmtw.e() || aury.l(this))) {
            this.h = (acne) LayoutInflater.from(this).inflate(true != ausj.c(fmtw.b()) ? R.layout.auth_generic_suw_glif_activity_v2 : R.layout.auth_generic_suw_non_loading_glif, (ViewGroup) null, false);
        } else {
            this.h = (acne) LayoutInflater.from(this).inflate(true != z ? R.layout.auth_generic_suw_activity : R.layout.auth_generic_suw_glif_activity, (ViewGroup) null, false);
        }
        atmr.e((ViewGroup) this.h);
        this.q = (acnh) this.h;
        this.h.b((String) s().a(afjo.d));
        this.h.e(l());
        Integer num = (Integer) s().a(afjo.f);
        if (num != null) {
            this.h.a(num.intValue() == 0);
        }
        this.h.d(this);
        Controller controller = this.v;
        String format = controller == null ? "AuthErrors" : String.format("Auth%sErrors", controller.b());
        Intent intent = getIntent();
        int i = afdw.a;
        int i2 = this.w;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("error", i2);
        bundle2.putLong("timestamp", efqg.a());
        new SetupMetric(format, 6, efqm.b(bundle2));
        afdw.a(intent);
        setContentView((View) this.h);
    }
}
