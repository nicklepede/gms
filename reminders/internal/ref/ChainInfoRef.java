package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.ChainInfo;
import com.google.android.gms.reminders.model.ChainInfoEntity;
import com.google.android.gms.reminders.model.FeatureIdProto;
import defpackage.cxeb;
import defpackage.cxee;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ChainInfoRef extends cxeb implements ChainInfo {
    private boolean f;
    private FeatureIdProtoRef g;

    public ChainInfoRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
        this.f = false;
    }

    public static boolean d(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.f(G(str, "chain_name"), i, i2) && FeatureIdProtoRef.d(dataHolder, i, i2, str.concat("chain_id_"));
    }

    @Override // com.google.android.gms.reminders.model.ChainInfo
    public final FeatureIdProto a() {
        if (!this.f) {
            this.f = true;
            DataHolder dataHolder = this.a;
            int i = this.b;
            int i2 = this.e;
            String str = this.d;
            if (FeatureIdProtoRef.d(dataHolder, i, i2, str.concat("chain_id_"))) {
                this.g = null;
            } else {
                this.g = new FeatureIdProtoRef(dataHolder, this.b, str.concat("chain_id_"));
            }
        }
        return this.g;
    }

    @Override // com.google.android.gms.reminders.model.ChainInfo
    public final String c() {
        return r(p("chain_name"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.arnw
    public final boolean equals(Object obj) {
        if (!(obj instanceof ChainInfo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return ChainInfoEntity.d(this, (ChainInfo) obj);
    }

    @Override // defpackage.arnw
    public final int hashCode() {
        return ChainInfoEntity.b(this);
    }

    @Override // defpackage.arnw, defpackage.arod
    public final /* synthetic */ Object l() {
        return new ChainInfoEntity(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cxee.a(new ChainInfoEntity(this), parcel, i);
    }
}
