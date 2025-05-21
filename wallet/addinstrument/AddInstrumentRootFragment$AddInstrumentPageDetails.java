package com.google.android.gms.wallet.addinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.difd;
import defpackage.ehjj;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AddInstrumentRootFragment$AddInstrumentPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new difd();

    public AddInstrumentRootFragment$AddInstrumentPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final feen a() {
        return (feen) ehjj.a.iB(7, null);
    }

    public AddInstrumentRootFragment$AddInstrumentPageDetails(Parcel parcel) {
        super(parcel);
    }

    public AddInstrumentRootFragment$AddInstrumentPageDetails(PageDetails pageDetails) {
        super(pageDetails);
    }
}
