package com.google.android.gms.wallet.idcredit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dirg;
import defpackage.eidp;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class IdCreditFragment$IdCreditPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dirg();

    public IdCreditFragment$IdCreditPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final feen a() {
        return (feen) eidp.a.iB(7, null);
    }

    public IdCreditFragment$IdCreditPageDetails(Parcel parcel) {
        super(parcel);
    }
}
