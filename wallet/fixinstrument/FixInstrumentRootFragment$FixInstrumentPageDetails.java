package com.google.android.gms.wallet.fixinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dlcb;
import defpackage.fdit;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FixInstrumentRootFragment$FixInstrumentPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dlcb();

    public FixInstrumentRootFragment$FixInstrumentPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final fgtg a() {
        return (fgtg) fdit.a.iQ(7, null);
    }

    public FixInstrumentRootFragment$FixInstrumentPageDetails(Parcel parcel) {
        super(parcel);
    }
}
