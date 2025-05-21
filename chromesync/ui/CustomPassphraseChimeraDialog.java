package com.google.android.gms.chromesync.ui;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.chromesync.ui.CustomPassphraseChimeraDialog;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.aprj;
import defpackage.fmft;
import defpackage.fmgi;
import defpackage.fvbo;
import defpackage.itj;
import defpackage.iuf;
import defpackage.iuo;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CustomPassphraseChimeraDialog extends qfp {
    public Account j;

    public final void a(Uri uri) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, getString(R.string.common_no_browser_found), 1).show();
        }
    }

    public final void b(TextInputLayout textInputLayout, boolean z) {
        textInputLayout.A(z ? getString(R.string.chromesync_entered_wrong_passphrase) : null);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        LinearLayout linearLayout;
        super.onCreate(bundle);
        setResult(0);
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        Account account = bundle != null ? (Account) bundle.getParcelable("account") : null;
        if (account == null) {
            finish();
            return;
        }
        this.j = account;
        setContentView(R.layout.chromesync_custom_passphrase_dialog);
        if (fmgi.a.a().j() && (linearLayout = (LinearLayout) findViewById(R.id.chromesync_custom_passphrase_dialog)) != null) {
            itj itjVar = new itj() { // from class: aprh
                @Override // defpackage.itj
                public final iwd eB(View view, iwd iwdVar) {
                    fvbo.f(view, "view");
                    imx f = iwdVar.f(647);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin = f.b;
                    marginLayoutParams.topMargin = f.c;
                    marginLayoutParams.rightMargin = f.d;
                    marginLayoutParams.bottomMargin = f.e;
                    view.setLayoutParams(marginLayoutParams);
                    return iwd.a;
                }
            };
            int[] iArr = iuo.a;
            iuf.k(linearLayout, itjVar);
        }
        final EditText editText = (EditText) findViewById(R.id.chromesync_enter_passphrase);
        final View findViewById = findViewById(R.id.chromesync_custom_passphrase_continue);
        fvbo.c(editText);
        fvbo.c(findViewById);
        editText.addTextChangedListener(new aprj(findViewById));
        TextView textView = (TextView) findViewById(R.id.chromesync_custom_passphrase_description);
        textView.setText(Html.fromHtml(textView.getResources().getString(R.string.chromesync_custom_passphrase_explanation, fmft.f())));
        textView.setOnClickListener(new View.OnClickListener() { // from class: aprd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String f = fmft.f();
                fvbo.e(f, "chromeDashboardLink(...)");
                CustomPassphraseChimeraDialog.this.a(Uri.parse(f));
            }
        });
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: apre
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText2 = editText;
                fvbo.c(editText2);
                final View view2 = findViewById;
                fvbo.c(view2);
                final CustomPassphraseChimeraDialog customPassphraseChimeraDialog = CustomPassphraseChimeraDialog.this;
                final TextInputLayout textInputLayout = (TextInputLayout) customPassphraseChimeraDialog.findViewById(R.id.chromesync_enter_passphrase_input_layout);
                fvbo.c(textInputLayout);
                customPassphraseChimeraDialog.b(textInputLayout, false);
                view2.setEnabled(false);
                Account account2 = customPassphraseChimeraDialog.j;
                if (account2 == null) {
                    fvbo.j("account");
                    account2 = null;
                }
                aqxo i = aprv.i(customPassphraseChimeraDialog, account2);
                final String obj = editText2.getText().toString();
                arwm.q(obj);
                arcy arcyVar = new arcy();
                arcyVar.d = 902;
                arcyVar.a = new arco() { // from class: aprw
                    @Override // defpackage.arco
                    public final void d(Object obj2, Object obj3) {
                        apsh apshVar = (apsh) obj2;
                        Context context = apshVar.r;
                        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
                        ((apsk) apshVar.H()).q(new apaj((dfau) obj3), obj, Bundle.EMPTY, new ApiMetadata(complianceOptions));
                    }
                };
                i.iT(arcyVar.a()).x(new dfae() { // from class: aprg
                    @Override // defpackage.dfae
                    public final void hr(dfaq dfaqVar) {
                        view2.setEnabled(true);
                        CustomPassphraseChimeraDialog customPassphraseChimeraDialog2 = customPassphraseChimeraDialog;
                        if (dfaqVar.m()) {
                            customPassphraseChimeraDialog2.setResult(-1);
                            customPassphraseChimeraDialog2.finish();
                        } else {
                            TextInputLayout textInputLayout2 = textInputLayout;
                            fvbo.c(textInputLayout2);
                            customPassphraseChimeraDialog2.b(textInputLayout2, true);
                        }
                    }
                });
            }
        });
        findViewById(R.id.chromesync_custom_passphrase_cancel).setOnClickListener(new View.OnClickListener() { // from class: aprf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomPassphraseChimeraDialog.this.finish();
            }
        });
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        fvbo.f(bundle, "outState");
        Account account = this.j;
        if (account == null) {
            fvbo.j("account");
            account = null;
        }
        bundle.putParcelable("account", account);
        super.onSaveInstanceState(bundle);
    }
}
