package com.google.android.gms.auth.api.phone.ui;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.asng;
import defpackage.asot;
import defpackage.assx;
import defpackage.ebjq;
import defpackage.ejhf;
import defpackage.qet;
import defpackage.zmb;
import defpackage.zmv;
import defpackage.zmw;
import defpackage.zmx;
import defpackage.znn;
import defpackage.zns;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class BrowserConsentChimeraActivity extends qet {
    private static final asot o = asot.a("BrowserConsentChimeraActivity");
    public zns j;
    public Context k;
    public String l;
    public zmb m;
    ebjq n;

    private final boolean k(String str) {
        if (TextUtils.isEmpty(str)) {
            ((ejhf) o.h()).x("Not from startActivityForResult(). This calling is invalid.");
            return false;
        }
        if (znn.d(this.k, str)) {
            return true;
        }
        ((ejhf) o.h()).x("Caller is not current default browser. This calling is invalid.");
        return false;
    }

    public final void a() {
        this.m.c();
        setResult(0);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = getApplicationContext();
        this.j = new zns();
        String q = asng.q(this);
        if (!k(q)) {
            this.j.k(this.k, zns.r(q, 10));
            finish();
            return;
        }
        this.l = q;
        this.j.k(this.k, zns.r(q, 0));
        this.m = new zmb(this.k);
        ebjq ebjqVar = new ebjq(this, R.style.BottomSheetDialogTheme);
        this.n = ebjqVar;
        ebjqVar.setCanceledOnTouchOutside(false);
        ebjq ebjqVar2 = this.n;
        String str = this.l;
        View inflate = getLayoutInflater().inflate(R.layout.sms_user_consent_fragment, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.consent_description);
        try {
            String charSequence = assx.b(this.k).h(str).toString();
            if (!TextUtils.isEmpty(charSequence)) {
                str = charSequence;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        String string = getString(R.string.sms_code_browser_consent_title, new Object[]{str});
        SpannableString spannableString = new SpannableString(string);
        int indexOf = string.indexOf(str);
        spannableString.setSpan(new StyleSpan(1), indexOf, str.length() + indexOf, 33);
        textView.setText(spannableString);
        ((TextView) inflate.findViewById(R.id.matched_sms)).setText(getString(R.string.sms_code_autofill_consent_message_for_settings_under_autofill_subcategory));
        ((Button) inflate.findViewById(R.id.negative_button)).setOnClickListener(new zmw(this));
        ((Button) inflate.findViewById(R.id.positive_button)).setOnClickListener(new zmx(this));
        ebjqVar2.setContentView(inflate);
        this.n.setOnCancelListener(new zmv(this));
        this.n.show();
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        ebjq ebjqVar = this.n;
        if (ebjqVar == null || !ebjqVar.isShowing()) {
            return;
        }
        this.n.dismiss();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        if (k(asng.q(this))) {
            return;
        }
        finish();
    }
}
