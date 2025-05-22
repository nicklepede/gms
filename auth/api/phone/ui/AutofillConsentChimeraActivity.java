package com.google.android.gms.auth.api.phone.ui;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.abma;
import defpackage.abml;
import defpackage.abmm;
import defpackage.abmn;
import defpackage.abmo;
import defpackage.abnm;
import defpackage.abns;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auwr;
import defpackage.edwd;
import defpackage.eluo;
import defpackage.fnki;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AutofillConsentChimeraActivity extends rxx {
    public static final /* synthetic */ int o = 0;
    private static final ausn p = ausn.b("AutofillConsentChimeraActivity", auid.AUTOFILL);
    public abns j;
    public Context k;
    public String l;
    public abma m;
    edwd n;

    private final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            ((eluo) p.h()).x("Not from startActivityForResult(). This calling is invalid.");
            return false;
        }
        if (abnm.e(this.k, str)) {
            return true;
        }
        ((eluo) p.h()).x("Caller is not current autofill service. This calling is invalid.");
        return false;
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = getApplicationContext();
        this.j = new abns();
        String q = aura.q(this);
        if (!a(q)) {
            this.j.k(this.k, abns.o(q, 10));
            finish();
            return;
        }
        this.l = q;
        this.j.k(this.k, abns.o(q, 0));
        this.m = new abma(this.k);
        edwd edwdVar = new edwd(this, R.style.BottomSheetDialogTheme);
        this.n = edwdVar;
        edwdVar.setCanceledOnTouchOutside(false);
        edwd edwdVar2 = this.n;
        String str = this.l;
        View inflate = getLayoutInflater().inflate(R.layout.sms_user_consent_fragment, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.consent_description);
        if (fnki.a.lK().a() && "com.google.android.gms".equals(str)) {
            str = getString(R.string.sms_code_autofill_service_name_for_autofill_with_google);
        } else {
            try {
                String charSequence = auwr.b(this.k).h(str).toString();
                if (!TextUtils.isEmpty(charSequence)) {
                    str = charSequence;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = getString(R.string.sms_code_autofill_consent_title_for_twice_showup, new Object[]{str});
        SpannableString spannableString = new SpannableString(string);
        int indexOf = string.indexOf(str);
        spannableString.setSpan(new StyleSpan(1), indexOf, str.length() + indexOf, 33);
        textView.setText(spannableString);
        TextView textView2 = (TextView) inflate.findViewById(R.id.matched_sms);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String string2 = getString(R.string.sms_code_autofill_consent_settings_path);
        String string3 = getString(R.string.sms_code_autofill_consent_message_for_twice_showup, new Object[]{string2});
        SpannableString spannableString2 = new SpannableString(string3);
        abmo abmoVar = new abmo();
        int indexOf2 = string3.indexOf(string2);
        spannableString2.setSpan(abmoVar, indexOf2, string2.length() + indexOf2, 33);
        textView2.setText(spannableString2);
        Button button = (Button) inflate.findViewById(R.id.negative_button);
        button.setOnClickListener(new abmm(this));
        if (this.m.b() <= 0) {
            button.setText(getString(R.string.common_not_now));
        } else {
            button.setText(getString(R.string.common_never));
        }
        ((Button) inflate.findViewById(R.id.positive_button)).setOnClickListener(new abmn(this));
        edwdVar2.setContentView(inflate);
        this.n.setOnCancelListener(new abml(this));
        Window window = this.n.getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
        }
        this.n.show();
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        edwd edwdVar = this.n;
        if (edwdVar == null || !edwdVar.isShowing()) {
            return;
        }
        this.n.dismiss();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        if (a(aura.q(this))) {
            return;
        }
        finish();
    }
}
