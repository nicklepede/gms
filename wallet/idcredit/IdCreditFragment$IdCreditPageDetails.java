package com.google.android.gms.wallet.idcredit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dlcr;
import defpackage.ekqv;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class IdCreditFragment$IdCreditPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dlcr();

    public IdCreditFragment$IdCreditPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final fgtg a() {
        return (fgtg) ekqv.a.iQ(7, null);
    }

    public IdCreditFragment$IdCreditPageDetails(Parcel parcel) {
        super(parcel);
    }
}
