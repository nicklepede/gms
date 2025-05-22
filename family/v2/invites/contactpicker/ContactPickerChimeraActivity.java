package com.google.android.gms.family.v2.invites.contactpicker;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import defpackage.aura;
import defpackage.bbua;
import defpackage.bccw;
import defpackage.bccy;
import defpackage.bp;
import defpackage.ekvl;
import defpackage.rxx;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ContactPickerChimeraActivity extends rxx implements bccw {
    @Override // defpackage.bccw
    public final void a(List list) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("selectedContacts", new ArrayList<>(list));
        setResult(-1, intent);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fm_activity_contact_picker);
        bbua.d(this, getIntent(), aura.q(this));
        ContactPickerOptionsData contactPickerOptionsData = (ContactPickerOptionsData) getIntent().getParcelableExtra("contactPickerOptions");
        ekvl.y(contactPickerOptionsData);
        bp bpVar = new bp(getSupportFragmentManager());
        bccy bccyVar = new bccy();
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("contactPickerOptionsData", contactPickerOptionsData);
        bccyVar.setArguments(bundle2);
        bpVar.t(R.id.fm_contact_picker_fragment_container, bccyVar);
        bpVar.a();
    }
}
