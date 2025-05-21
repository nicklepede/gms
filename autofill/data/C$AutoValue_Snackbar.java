package com.google.android.gms.autofill.data;

import android.content.Intent;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.autofill.data.$AutoValue_Snackbar, reason: invalid class name */
/* loaded from: classes3.dex */
abstract class C$AutoValue_Snackbar extends Snackbar {
    public final String a;
    public final String b;
    public final Intent c;
    public final int d;

    public C$AutoValue_Snackbar(String str, String str2, Intent intent, int i) {
        if (str == null) {
            throw new NullPointerException("Null displayText");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null actionButtonLabel");
        }
        this.b = str2;
        if (intent == null) {
            throw new NullPointerException("Null actionButtonIntent");
        }
        this.c = intent;
        this.d = i;
    }

    @Override // com.google.android.gms.autofill.data.Snackbar
    public final Intent a() {
        return this.c;
    }

    @Override // com.google.android.gms.autofill.data.Snackbar
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.autofill.data.Snackbar
    public final String c() {
        return this.a;
    }

    @Override // com.google.android.gms.autofill.data.Snackbar
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Snackbar) {
            Snackbar snackbar = (Snackbar) obj;
            if (this.a.equals(snackbar.c()) && this.b.equals(snackbar.b()) && this.c.equals(snackbar.a()) && this.d == snackbar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        int i = this.d;
        return "Snackbar{displayText=" + this.a + ", actionButtonLabel=" + this.b + ", actionButtonIntent=" + this.c.toString() + ", useCaseForMetrics=" + Integer.toString(i - 2) + "}";
    }
}
