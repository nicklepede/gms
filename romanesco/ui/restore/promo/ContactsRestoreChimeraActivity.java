package com.google.android.gms.romanesco.ui.restore.promo;

import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.romanesco.ui.restore.promo.ContactsRestoreChimeraActivity;
import defpackage.czst;
import defpackage.cztc;
import defpackage.czuo;
import defpackage.dadk;
import defpackage.dadl;
import defpackage.edxt;
import defpackage.ekut;
import defpackage.elgo;
import defpackage.eqex;
import defpackage.fttk;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ContactsRestoreChimeraActivity extends rxx {
    public boolean j;

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setTheme(R.style.ContactsRestoreUiTheme3);
        getContainerActivity();
        int i = edxt.a;
        setContentView(R.layout.romanesco_contacts_restore_activity);
        dadk dadkVar = (dadk) new jxw(this, dadl.d(this)).a(dadk.class);
        if (fttk.p()) {
            if (!getIntent().hasExtra("authAccount")) {
                cztc.a().d("CRCA.restore_account_not_populated.");
                finish();
                return;
            }
            dadkVar.h(getIntent().getStringExtra("authAccount"));
        } else {
            if (!getIntent().hasExtra("people_ui_contacts_restore_account_name")) {
                cztc.a().d("CRCA.restore_account_not_populated.");
                finish();
                return;
            }
            dadkVar.h(getIntent().getStringExtra("people_ui_contacts_restore_account_name"));
        }
        if (getIntent().hasExtra("romanesco_restore_contacts_restore_selected_backup_device_id")) {
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("romanesco_restore_contacts_restore_selected_backup_device_id");
            czst czstVar = dadkVar.c;
            String[] strArr = (String[]) stringArrayListExtra.toArray(new String[0]);
            HashSet hashSet = new HashSet();
            for (String str2 : strArr) {
                if (str2.matches("^[A-Fa-f0-9]+$")) {
                    hashSet.add(str2);
                }
            }
            czuo czuoVar = czstVar.g;
            final elgo i2 = elgo.i(hashSet);
            czuo.e(czuoVar.b.b(new ekut() { // from class: cztd
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    czsm czsmVar = (czsm) obj;
                    int i3 = czuo.c;
                    fgrc fgrcVar = (fgrc) czsmVar.iQ(5, null);
                    fgrcVar.X(czsmVar);
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    czsm czsmVar2 = (czsm) fgrcVar.b;
                    czsm czsmVar3 = czsm.a;
                    czsmVar2.j = fgtj.a;
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    czsm czsmVar4 = (czsm) fgrcVar.b;
                    fgsa fgsaVar = czsmVar4.j;
                    if (!fgsaVar.c()) {
                        czsmVar4.j = fgri.E(fgsaVar);
                    }
                    fgou.E(i2, czsmVar4.j);
                    return (czsm) fgrcVar.Q();
                }
            }, eqex.a));
        }
        if (getIntent().hasExtra("romanesco_restore_is_gms_backup")) {
            dadkVar.c.b = getIntent().getBooleanExtra("romanesco_restore_is_gms_backup", false);
        }
        if (getIntent().hasExtra("romanesco_restore_referrer_id")) {
            str = getIntent().getStringExtra("romanesco_restore_referrer_id");
            dadkVar.c.v(str);
        } else {
            str = "UNKNOWN_ENTRY_POINT";
        }
        dadkVar.b.g(this, new jvs() { // from class: dabg
            @Override // defpackage.jvs
            public final void a(Object obj) {
                int intValue = ((Integer) obj).intValue();
                ContactsRestoreChimeraActivity contactsRestoreChimeraActivity = ContactsRestoreChimeraActivity.this;
                bp bpVar = new bp(contactsRestoreChimeraActivity.getSupportFragmentManager());
                bpVar.A(R.anim.abc_popup_enter, R.anim.abc_popup_exit, R.anim.abc_popup_enter, R.anim.abc_popup_exit);
                if (intValue == 0) {
                    bpVar.z(R.id.root, new dacn(), "TAG_ACCOUNT_RESTORE_FRAGMENT");
                } else if (intValue == 1) {
                    bpVar.z(R.id.root, new dabu(), "TAG_CONTACTS_RESTORE_CONTACTS_FRAGMENT");
                } else if (intValue == 2) {
                    bpVar.z(R.id.root, new dacv(), "TAG_CONTACT_RESTORE_PROGRESS_FRAGMENT");
                } else if (intValue != 3) {
                    return;
                } else {
                    bpVar.z(R.id.root, new dabi(), "TAG_CONTACT_RESTORE_COMPLETE_FRAGMENT");
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
            cztc.a().s(true, 2, str, dadkVar.j());
            dadkVar.f();
        }
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        super.onDestroy();
        czst d = czst.d(getApplicationContext());
        d.q();
        d.a.clear();
        d.p();
    }
}
