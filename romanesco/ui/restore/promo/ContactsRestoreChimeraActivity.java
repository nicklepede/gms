package com.google.android.gms.romanesco.ui.restore.promo;

import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.romanesco.ui.restore.promo.ContactsRestoreChimeraActivity;
import defpackage.cxix;
import defpackage.cxjg;
import defpackage.cxks;
import defpackage.cxtn;
import defpackage.cxto;
import defpackage.eble;
import defpackage.eiho;
import defpackage.eitj;
import defpackage.enre;
import defpackage.fqzp;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ContactsRestoreChimeraActivity extends qet {
    public boolean j;

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setTheme(R.style.ContactsRestoreUiTheme3);
        getContainerActivity();
        int i = eble.a;
        setContentView(R.layout.romanesco_contacts_restore_activity);
        cxtn cxtnVar = (cxtn) new jrh(this, cxto.d(this)).a(cxtn.class);
        if (fqzp.p()) {
            if (!getIntent().hasExtra("authAccount")) {
                cxjg.a().d("CRCA.restore_account_not_populated.");
                finish();
                return;
            }
            cxtnVar.h(getIntent().getStringExtra("authAccount"));
        } else {
            if (!getIntent().hasExtra("people_ui_contacts_restore_account_name")) {
                cxjg.a().d("CRCA.restore_account_not_populated.");
                finish();
                return;
            }
            cxtnVar.h(getIntent().getStringExtra("people_ui_contacts_restore_account_name"));
        }
        if (getIntent().hasExtra("romanesco_restore_contacts_restore_selected_backup_device_id")) {
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("romanesco_restore_contacts_restore_selected_backup_device_id");
            cxix cxixVar = cxtnVar.c;
            String[] strArr = (String[]) stringArrayListExtra.toArray(new String[0]);
            HashSet hashSet = new HashSet();
            for (String str2 : strArr) {
                if (str2.matches("^[A-Fa-f0-9]+$")) {
                    hashSet.add(str2);
                }
            }
            cxks cxksVar = cxixVar.g;
            final eitj i2 = eitj.i(hashSet);
            cxks.e(cxksVar.b.b(new eiho() { // from class: cxjh
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    cxiq cxiqVar = (cxiq) obj;
                    int i3 = cxks.c;
                    fecj fecjVar = (fecj) cxiqVar.iB(5, null);
                    fecjVar.X(cxiqVar);
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    cxiq cxiqVar2 = (cxiq) fecjVar.b;
                    cxiq cxiqVar3 = cxiq.a;
                    cxiqVar2.j = feeq.a;
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    cxiq cxiqVar4 = (cxiq) fecjVar.b;
                    fedh fedhVar = cxiqVar4.j;
                    if (!fedhVar.c()) {
                        cxiqVar4.j = fecp.E(fedhVar);
                    }
                    feab.E(i2, cxiqVar4.j);
                    return (cxiq) fecjVar.Q();
                }
            }, enre.a));
        }
        if (getIntent().hasExtra("romanesco_restore_is_gms_backup")) {
            cxtnVar.c.b = getIntent().getBooleanExtra("romanesco_restore_is_gms_backup", false);
        }
        if (getIntent().hasExtra("romanesco_restore_referrer_id")) {
            str = getIntent().getStringExtra("romanesco_restore_referrer_id");
            cxtnVar.c.v(str);
        } else {
            str = "UNKNOWN_ENTRY_POINT";
        }
        cxtnVar.b.g(this, new jpd() { // from class: cxrj
            @Override // defpackage.jpd
            public final void a(Object obj) {
                int intValue = ((Integer) obj).intValue();
                ContactsRestoreChimeraActivity contactsRestoreChimeraActivity = ContactsRestoreChimeraActivity.this;
                bp bpVar = new bp(contactsRestoreChimeraActivity.getSupportFragmentManager());
                bpVar.A(R.anim.abc_popup_enter, R.anim.abc_popup_exit, R.anim.abc_popup_enter, R.anim.abc_popup_exit);
                if (intValue == 0) {
                    bpVar.z(R.id.root, new cxsq(), "TAG_ACCOUNT_RESTORE_FRAGMENT");
                } else if (intValue == 1) {
                    bpVar.z(R.id.root, new cxrx(), "TAG_CONTACTS_RESTORE_CONTACTS_FRAGMENT");
                } else if (intValue == 2) {
                    bpVar.z(R.id.root, new cxsy(), "TAG_CONTACT_RESTORE_PROGRESS_FRAGMENT");
                } else if (intValue != 3) {
                    return;
                } else {
                    bpVar.z(R.id.root, new cxrl(), "TAG_CONTACT_RESTORE_COMPLETE_FRAGMENT");
                }
                if (!contactsRestoreChimeraActivity.j) {
                    bpVar.w(null);
                }
                contactsRestoreChimeraActivity.j = false;
                bpVar.b();
            }
        });
        int size = getSupportFragmentManager().o().size();
        this.j = size <= 1;
        if (bundle == null || size <= 1) {
            cxjg.a().s(true, 2, str, cxtnVar.j());
            cxtnVar.f();
        }
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        super.onDestroy();
        cxix d = cxix.d(getApplicationContext());
        d.q();
        d.a.clear();
        d.p();
    }
}
