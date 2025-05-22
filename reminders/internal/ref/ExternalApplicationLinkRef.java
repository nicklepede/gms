package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.ExternalApplicationLink;
import com.google.android.gms.reminders.model.ExternalApplicationLinkEntity;
import defpackage.cznx;
import defpackage.czof;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ExternalApplicationLinkRef extends cznx implements ExternalApplicationLink {
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

    @Override // defpackage.atql
    public final boolean equals(Object obj) {
        if (!(obj instanceof ExternalApplicationLink)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return ExternalApplicationLinkEntity.d(this, (ExternalApplicationLink) obj);
    }

    @Override // defpackage.atql
    public final int hashCode() {
        return ExternalApplicationLinkEntity.b(this);
    }

    @Override // defpackage.atql, defpackage.atqs
    public final /* synthetic */ Object l() {
        return new ExternalApplicationLinkEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        czof.a(new ExternalApplicationLinkEntity(this), parcel);
    }
}
