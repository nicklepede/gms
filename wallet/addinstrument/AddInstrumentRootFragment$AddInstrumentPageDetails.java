package com.google.android.gms.wallet.addinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dkqo;
import defpackage.ejwp;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AddInstrumentRootFragment$AddInstrumentPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dkqo();

    public AddInstrumentRootFragment$AddInstrumentPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final fgtg a() {
        return (fgtg) ejwp.a.iQ(7, null);
    }

    public AddInstrumentRootFragment$AddInstrumentPageDetails(Parcel parcel) {
        super(parcel);
    }

    public AddInstrumentRootFragment$AddInstrumentPageDetails(PageDetails pageDetails) {
        super(pageDetails);
    }
}
