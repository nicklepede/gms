package com.google.android.gms.instantapps.shared;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bolh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PatternMatcher implements Parcelable {
    private final String b;
    private final int c;
    private final int[] d;
    private static final int[] a = new int[2048];
    public static final Parcelable.Creator CREATOR = new bolh();

    public PatternMatcher(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.createIntArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00b7, code lost:
    
        throw new java.lang.IllegalArgumentException("Modifier must follow a token.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00e2, code lost:
    
        throw new java.lang.IllegalArgumentException("Modifier must follow a token.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0052, code lost:
    
        throw new java.lang.IllegalArgumentException("You must define characters in a set.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static synchronized int[] b(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.instantapps.shared.PatternMatcher.b(java.lang.String):int[]");
    }

    private static boolean c(int i) {
        return i == -8 || i == -7 || i == -6 || i == -5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x013b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.instantapps.shared.PatternMatcher.a(java.lang.String):boolean");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        int i = this.c;
        return "PatternMatcher{" + (i != 0 ? i != 1 ? i != 2 ? i != 3 ? "? " : "ADVANCED: " : "GLOB: " : "PREFIX: " : "LITERAL: ") + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeIntArray(this.d);
    }

    public PatternMatcher(String str, int i) {
        this.b = str;
        this.c = i;
        if (i == 3) {
            this.d = b(str);
        } else {
            this.d = null;
        }
    }
}
