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
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.assx;
import defpackage.ebjq;
import defpackage.ejhf;
import defpackage.fkth;
import defpackage.qet;
import defpackage.zma;
import defpackage.zml;
import defpackage.zmm;
import defpackage.zmn;
import defpackage.zmo;
import defpackage.znm;
import defpackage.zns;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AutofillConsentChimeraActivity extends qet {
    public static final /* synthetic */ int o = 0;
    private static final asot p = asot.b("AutofillConsentChimeraActivity", asej.AUTOFILL);
    public zns j;
    public Context k;
    public String l;
    public zma m;
    ebjq n;

    private final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            ((ejhf) p.h()).x("Not from startActivityForResult(). This calling is invalid.");
            return false;
        }
        if (znm.e(this.k, str)) {
            return true;
        }
        ((ejhf) p.h()).x("Caller is not current autofill service. This calling is invalid.");
        return false;
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = getApplicationContext();
        this.j = new zns();
        String q = asng.q(this);
        if (!a(q)) {
            this.j.k(this.k, zns.o(q, 10));
            finish();
            return;
        }
        this.l = q;
        this.j.k(this.k, zns.o(q, 0));
        this.m = new zma(this.k);
        ebjq ebjqVar = new ebjq(this, R.style.BottomSheetDialogTheme);
        this.n = ebjqVar;
        ebjqVar.setCanceledOnTouchOutside(false);
        ebjq ebjqVar2 = this.n;
        String str = this.l;
        View inflate = getLayoutInflater().inflate(R.layout.sms_user_consent_fragment, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.consent_description);
        if (fkth.a.a().a() && "com.google.android.gms".equals(str)) {
            str = getString(R.string.sms_code_autofill_service_name_for_autofill_with_google);
        } else {
            try {
                String charSequence = assx.b(this.k).h(str).toString();
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
        zmo zmoVar = new zmo();
        int indexOf2 = string3.indexOf(string2);
        spannableString2.setSpan(zmoVar, indexOf2, string2.length() + indexOf2, 33);
        textView2.setText(spannableString2);
        Button button = (Button) inflate.findViewById(R.id.negative_button);
        button.setOnClickListener(new zmm(this));
        if (this.m.b() <= 0) {
            button.setText(getString(R.string.common_not_now));
        } else {
            button.setText(getString(R.string.common_never));
        }
        ((Button) inflate.findViewById(R.id.positive_button)).setOnClickListener(new zmn(this));
        ebjqVar2.setContentView(inflate);
        this.n.setOnCancelListener(new zml(this));
        Window window = this.n.getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
        }
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
        if (a(asng.q(this))) {
            return;
        }
        finish();
    }
}
