package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.ExternalApplicationLink;
import com.google.android.gms.reminders.model.ExternalApplicationLinkEntity;
import defpackage.cxeb;
import defpackage.cxej;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ExternalApplicationLinkRef extends cxeb implements ExternalApplicationLink {
    public ExternalApplicationLinkRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    @Override // com.google.android.gms.reminders.model.ExternalApplicationLink
    public final Integer a() {
        return n(p("link_application"));
    }

    @Override // com.google.android.gms.reminders.model.ExternalApplicationLink
    public final String c() {
        return r(p("link_id"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.arnw
    public final boolean equals(Object obj) {
        if (!(obj instanceof ExternalApplicationLink)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return ExternalApplicationLinkEntity.d(this, (ExternalApplicationLink) obj);
    }

    @Override // defpackage.arnw
    public final int hashCode() {
        return ExternalApplicationLinkEntity.b(this);
    }

    @Override // defpackage.arnw, defpackage.arod
    public final /* synthetic */ Object l() {
        return new ExternalApplicationLinkEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxej.a(new ExternalApplicationLinkEntity(this), parcel);
    }
}
