package com.google.android.gms.romanesco.ui.restore.settings;

import android.accounts.Account;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.romanesco.ui.restore.settings.ContactsRestoreSettingsChimeraActivity;
import defpackage.asmf;
import defpackage.bp;
import defpackage.cxix;
import defpackage.cxtt;
import defpackage.cxvj;
import defpackage.cxvv;
import defpackage.cxvw;
import defpackage.dtmk;
import defpackage.dtyl;
import defpackage.dtyz;
import defpackage.duju;
import defpackage.eble;
import defpackage.eihn;
import defpackage.fvaq;
import defpackage.jpd;
import defpackage.jqu;
import defpackage.jrh;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ContactsRestoreSettingsChimeraActivity extends qet {
    public dtmk j;
    private cxvj k;

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        if (getSupportFragmentManager().h("TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT") != null && getSupportFragmentManager().h("TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT").isVisible()) {
            finish();
            return;
        }
        cxtt cxttVar = (cxtt) getSupportFragmentManager().h("TAG_CONTACT_RESTORE_COMPLETE_FRAGMENT");
        if (cxttVar == null || !cxttVar.isVisible()) {
            super.onBackPressed();
        } else {
            cxttVar.a.c();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.ContactsRestoreUiTheme3);
        getContainerActivity();
        int i = eble.a;
        setContentView(R.layout.romanesco_contacts_restore_settings_activity);
        final cxvv cxvvVar = (cxvv) new jrh(this, cxvw.d(this)).a(cxvv.class);
        if (bundle == null && getIntent().hasExtra("authAccount")) {
            String stringExtra = getIntent().getStringExtra("authAccount");
            if (stringExtra == null) {
                stringExtra = "";
            }
            cxvvVar.b.i = stringExtra;
            cxvvVar.c.p();
            if (getIntent().hasExtra("romanesco_restore_referrer_id")) {
                String stringExtra2 = getIntent().getStringExtra("romanesco_restore_referrer_id") == null ? "UNKNOWN_ENTRY_POINT" : getIntent().getStringExtra("romanesco_restore_referrer_id");
                cxvvVar.e(true != eihn.a(stringExtra2, "UNKNOWN_ENTRY_POINT") ? stringExtra2 : "GOOGLE_SETTINGS_UI");
            } else {
                cxvvVar.e("GOOGLE_SETTINGS_UI");
            }
        }
        this.j = new dtmk(this, new asmf(Integer.MAX_VALUE, 9), new dtyl(), new dtyz(getApplicationContext(), duju.a()));
        cxix.d(getApplicationContext()).e = false;
        cxvvVar.a.g(this, new jpd() { // from class: cxus
            @Override // defpackage.jpd
            public final void a(Object obj) {
                int intValue = ((Integer) obj).intValue();
                bp bpVar = new bp(ContactsRestoreSettingsChimeraActivity.this.getSupportFragmentManager());
                bpVar.A(R.anim.abc_popup_enter, R.anim.abc_popup_exit, R.anim.abc_popup_enter, R.anim.abc_popup_exit);
                if (intValue == 0) {
                    bpVar.z(R.id.root, new cxvj(), "TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT");
                } else if (intValue == 1) {
                    bpVar.z(R.id.root, new cxvc(), "TAG_ACCOUNT_RESTORE_SETTINGS_VIEW_CONTACTS_FRAGMENT");
                } else if (intValue == 2) {
                    bpVar.z(R.id.root, new cxuf(), "TAG_RESTORE_SETTINGS_ACCOUNT_MENU_FRAGMENT");
                } else if (intValue == 3) {
                    bpVar.z(R.id.root, new cxtv(), "TAG_CONTACT_RESTORE_PROGRESS_FRAGMENT");
                } else if (intValue != 4) {
                    return;
                } else {
                    bpVar.z(R.id.root, new cxtt(), "TAG_CONTACT_RESTORE_COMPLETE_FRAGMENT");
                }
                bpVar.w(null);
                bpVar.b();
            }
        });
        jqu.c(cxvvVar.b, new fvaq() { // from class: cxvq
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                final Account account = (Account) obj;
                final jpc jpcVar = new jpc();
                final cxvv cxvvVar2 = cxvv.this;
                cxvvVar2.f.execute(new Runnable() { // from class: cxvt
                    @Override // java.lang.Runnable
                    public final void run() {
                        jpcVar.hS(cxit.a(cxvv.this.d.v, account));
                    }
                });
                return jpcVar;
            }
        }).g(this, new jpd() { // from class: cxut
            @Override // defpackage.jpd
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity = ContactsRestoreSettingsChimeraActivity.this;
                Toast.makeText(contactsRestoreSettingsChimeraActivity.getApplicationContext(), R.string.romanesco_ulp_unsupported, 0).show();
                contactsRestoreSettingsChimeraActivity.onBackPressed();
            }
        });
        if (bundle == null || getSupportFragmentManager().o().isEmpty()) {
            if (bundle != null) {
                this.k = (cxvj) getSupportFragmentManager().h("TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT");
                return;
            }
            this.k = new cxvj();
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.u(R.id.root, this.k, "TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT");
            bpVar.b();
        }
    }
}
