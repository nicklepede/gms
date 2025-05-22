package com.google.android.gms.wallet.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dlcw;
import defpackage.ekrh;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ImRootFragment$InstrumentManagerPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dlcw();

    public ImRootFragment$InstrumentManagerPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final fgtg a() {
        return (fgtg) ekrh.a.iQ(7, null);
    }

    public ImRootFragment$InstrumentManagerPageDetails(Parcel parcel) {
        super(parcel);
    }
}
