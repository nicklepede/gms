package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cxcz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class CreateReminderOptionsInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxcz();
    public static final CreateReminderOptionsInternal a = new CreateReminderOptionsInternal(null, null, false);
    public final String b;
    public final String c;
    public final boolean d;

    public CreateReminderOptionsInternal(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a2 = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.e(parcel, 4, this.d);
        arxc.c(parcel, a2);
    }
}
