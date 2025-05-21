package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.diqf;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SaveInstrumentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new diqf();
    public Card a;
    public ArrayList b;
    public byte[] c;

    private SaveInstrumentRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public SaveInstrumentRequest(Card card, ArrayList arrayList, byte[] bArr) {
        this.a = card;
        this.b = arrayList;
        this.c = bArr;
    }
}
