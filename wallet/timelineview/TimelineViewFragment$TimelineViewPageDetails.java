package com.google.android.gms.wallet.timelineview;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ui.common.PageDetails;
import defpackage.dlps;
import defpackage.fdjt;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TimelineViewFragment$TimelineViewPageDetails extends PageDetails {
    public static final Parcelable.Creator CREATOR = new dlps();

    public TimelineViewFragment$TimelineViewPageDetails() {
    }

    @Override // com.google.android.gms.wallet.ui.common.PageDetails
    protected final fgtg a() {
        return (fgtg) fdjt.a.iQ(7, null);
    }

    public TimelineViewFragment$TimelineViewPageDetails(Parcel parcel) {
        super(parcel);
    }
}
