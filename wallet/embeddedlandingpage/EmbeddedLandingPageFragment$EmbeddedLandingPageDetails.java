package com.google.android.gms.wallet.embeddedlandingpage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dioh;
import defpackage.faty;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class EmbeddedLandingPageFragment$EmbeddedLandingPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dioh();

    public EmbeddedLandingPageFragment$EmbeddedLandingPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final feen a() {
        return (feen) faty.a.iB(7, null);
    }

    public EmbeddedLandingPageFragment$EmbeddedLandingPageDetails(Parcel parcel) {
        super(parcel);
    }
}
