package com.google.android.gms.romanesco.ui.restore.settings;

import android.accounts.Account;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.romanesco.ui.restore.settings.ContactsRestoreSettingsChimeraActivity;
import defpackage.aupz;
import defpackage.bp;
import defpackage.czst;
import defpackage.dadq;
import defpackage.dafg;
import defpackage.dafs;
import defpackage.daft;
import defpackage.dvww;
import defpackage.dwix;
import defpackage.dwjl;
import defpackage.dwug;
import defpackage.edxt;
import defpackage.ekus;
import defpackage.fxwo;
import defpackage.jvs;
import defpackage.jxj;
import defpackage.jxw;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactsRestoreSettingsChimeraActivity extends rxx {
    public dvww j;
    private dafg k;

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (getSupportFragmentManager().h("TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT") != null && getSupportFragmentManager().h("TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT").isVisible()) {
            finish();
            return;
        }
        dadq dadqVar = (dadq) getSupportFragmentManager().h("TAG_CONTACT_RESTORE_COMPLETE_FRAGMENT");
        if (dadqVar == null || !dadqVar.isVisible()) {
            super.onBackPressed();
        } else {
            dadqVar.a.c();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.ContactsRestoreUiTheme3);
        getContainerActivity();
        int i = edxt.a;
        setContentView(R.layout.romanesco_contacts_restore_settings_activity);
        final dafs dafsVar = (dafs) new jxw(this, daft.d(this)).a(dafs.class);
        if (bundle == null && getIntent().hasExtra("authAccount")) {
            String stringExtra = getIntent().getStringExtra("authAccount");
            if (stringExtra == null) {
                stringExtra = "";
            }
            dafsVar.b.i = stringExtra;
            dafsVar.c.p();
            if (getIntent().hasExtra("romanesco_restore_referrer_id")) {
                String stringExtra2 = getIntent().getStringExtra("romanesco_restore_referrer_id") == null ? "UNKNOWN_ENTRY_POINT" : getIntent().getStringExtra("romanesco_restore_referrer_id");
                dafsVar.e(true != ekus.a(stringExtra2, "UNKNOWN_ENTRY_POINT") ? stringExtra2 : "GOOGLE_SETTINGS_UI");
            } else {
                dafsVar.e("GOOGLE_SETTINGS_UI");
            }
        }
        this.j = new dvww(this, new aupz(Integer.MAX_VALUE, 9), new dwix(), new dwjl(getApplicationContext(), dwug.a()));
        czst.d(getApplicationContext()).e = false;
        dafsVar.a.g(this, new jvs() { // from class: daep
            @Override // defpackage.jvs
            public final void a(Object obj) {
                int intValue = ((Integer) obj).intValue();
                bp bpVar = new bp(ContactsRestoreSettingsChimeraActivity.this.getSupportFragmentManager());
                bpVar.A(R.anim.abc_popup_enter, R.anim.abc_popup_exit, R.anim.abc_popup_enter, R.anim.abc_popup_exit);
                if (intValue == 0) {
                    bpVar.z(R.id.root, new dafg(), "TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT");
                } else if (intValue == 1) {
                    bpVar.z(R.id.root, new daez(), "TAG_ACCOUNT_RESTORE_SETTINGS_VIEW_CONTACTS_FRAGMENT");
                } else if (intValue == 2) {
                    bpVar.z(R.id.root, new daec(), "TAG_RESTORE_SETTINGS_ACCOUNT_MENU_FRAGMENT");
                } else if (intValue == 3) {
                    bpVar.z(R.id.root, new dads(), "TAG_CONTACT_RESTORE_PROGRESS_FRAGMENT");
                } else if (intValue != 4) {
                    return;
                } else {
                    bpVar.z(R.id.root, new dadq(), "TAG_CONTACT_RESTORE_COMPLETE_FRAGMENT");
                }
                bpVar.w(null);
                bpVar.b();
            }
        });
        jxj.c(dafsVar.b, new fxwo() { // from class: dafn
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                final Account account = (Account) obj;
                final jvr jvrVar = new jvr();
                final dafs dafsVar2 = dafs.this;
                dafsVar2.f.execute(new Runnable() { // from class: dafq
                    @Override // java.lang.Runnable
                    public final void run() {
                        jvrVar.ih(czsp.a(dafs.this.d.v, account));
                    }
                });
                return jvrVar;
            }
        }).g(this, new jvs() { // from class: daeq
            @Override // defpackage.jvs
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
                this.k = (dafg) getSupportFragmentManager().h("TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT");
                return;
            }
            this.k = new dafg();
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.u(R.id.root, this.k, "TAG_ACCOUNT_RESTORE_SETTINGS_FRAGMENT");
            bpVar.b();
        }
    }
}
