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
import com.google.android.material.textfield.TextInputLayout;
import defpackage.arua;
import defpackage.foxf;
import defpackage.foxu;
import defpackage.fxxm;
import defpackage.iuz;
import defpackage.ivv;
import defpackage.iwe;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class CustomPassphraseChimeraDialog extends ryt {
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

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
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
        if (foxu.a.lK().i() && (linearLayout = (LinearLayout) findViewById(R.id.chromesync_custom_passphrase_dialog)) != null) {
            iuz iuzVar = new iuz() { // from class: arty
                @Override // defpackage.iuz
                public final ixt eB(View view, ixt ixtVar) {
                    fxxm.f(view, "view");
                    ioo f = ixtVar.f(647);
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
                    return ixt.a;
                }
            };
            int[] iArr = iwe.a;
            ivv.k(linearLayout, iuzVar);
        }
        final EditText editText = (EditText) findViewById(R.id.chromesync_enter_passphrase);
        final View findViewById = findViewById(R.id.chromesync_custom_passphrase_continue);
        fxxm.c(editText);
        fxxm.c(findViewById);
        editText.addTextChangedListener(new arua(findViewById));
        TextView textView = (TextView) findViewById(R.id.chromesync_custom_passphrase_description);
        textView.setText(Html.fromHtml(textView.getResources().getString(R.string.chromesync_custom_passphrase_explanation, foxf.f())));
        textView.setOnClickListener(new View.OnClickListener() { // from class: artu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomPassphraseChimeraDialog.this.a(Uri.parse(foxf.f()));
            }
        });
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: artv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText2 = editText;
                fxxm.c(editText2);
                final View view2 = findViewById;
                fxxm.c(view2);
                final CustomPassphraseChimeraDialog customPassphraseChimeraDialog = CustomPassphraseChimeraDialog.this;
                final TextInputLayout textInputLayout = (TextInputLayout) customPassphraseChimeraDialog.findViewById(R.id.chromesync_enter_passphrase_input_layout);
                fxxm.c(textInputLayout);
                customPassphraseChimeraDialog.b(textInputLayout, false);
                view2.setEnabled(false);
                Account account2 = customPassphraseChimeraDialog.j;
                if (account2 == null) {
                    fxxm.j("account");
                    account2 = null;
                }
                atad i = arum.i(customPassphraseChimeraDialog, account2);
                final String obj = editText2.getText().toString();
                atzb.q(obj);
                atfn atfnVar = new atfn();
                atfnVar.d = 902;
                atfnVar.a = new atfd() { // from class: arun
                    @Override // defpackage.atfd
                    public final void d(Object obj2, Object obj3) {
                        aruy aruyVar = (aruy) obj2;
                        arvb arvbVar = (arvb) aruyVar.H();
                        arda ardaVar = new arda((dhma) obj3);
                        Context context = aruyVar.r;
                        arvbVar.q(ardaVar, obj, Bundle.EMPTY, bsxa.a(context));
                    }
                };
                i.ji(atfnVar.a()).x(new dhlk() { // from class: artx
                    @Override // defpackage.dhlk
                    public final void hH(dhlw dhlwVar) {
                        view2.setEnabled(true);
                        CustomPassphraseChimeraDialog customPassphraseChimeraDialog2 = customPassphraseChimeraDialog;
                        if (dhlwVar.m()) {
                            customPassphraseChimeraDialog2.setResult(-1);
                            customPassphraseChimeraDialog2.finish();
                        } else {
                            TextInputLayout textInputLayout2 = textInputLayout;
                            fxxm.c(textInputLayout2);
                            customPassphraseChimeraDialog2.b(textInputLayout2, true);
                        }
                    }
                });
            }
        });
        findViewById(R.id.chromesync_custom_passphrase_cancel).setOnClickListener(new View.OnClickListener() { // from class: artw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomPassphraseChimeraDialog.this.finish();
            }
        });
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        fxxm.f(bundle, "outState");
        Account account = this.j;
        if (account == null) {
            fxxm.j("account");
            account = null;
        }
        bundle.putParcelable("account", account);
        super.onSaveInstanceState(bundle);
    }
}
