package com.google.android.gms.family.v2.invites.contactpicker;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.family.v2.model.ContactPickerOptionsData;
import defpackage.asng;
import defpackage.azqe;
import defpackage.azza;
import defpackage.azzc;
import defpackage.bp;
import defpackage.eiig;
import defpackage.qet;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ContactPickerChimeraActivity extends qet implements azza {
    @Override // defpackage.azza
    public final void a(List list) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("selectedContacts", new ArrayList<>(list));
        setResult(-1, intent);
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fm_activity_contact_picker);
        azqe.d(this, getIntent(), asng.q(this));
        ContactPickerOptionsData contactPickerOptionsData = (ContactPickerOptionsData) getIntent().getParcelableExtra("contactPickerOptions");
        eiig.x(contactPickerOptionsData);
        bp bpVar = new bp(getSupportFragmentManager());
        azzc azzcVar = new azzc();
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("contactPickerOptionsData", contactPickerOptionsData);
        azzcVar.setArguments(bundle2);
        bpVar.t(R.id.fm_contact_picker_fragment_container, azzcVar);
        bpVar.a();
    }
}
