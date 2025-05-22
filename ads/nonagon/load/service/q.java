package com.google.android.gms.ads.nonagon.load.service;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.ExceptionParcel;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes2.dex */
public final class q extends com.google.android.gms.ads.internal.request.g {
    @Override // com.google.android.gms.ads.internal.request.h
    public final void a(com.google.android.gms.ads.internal.request.i iVar) {
        try {
            iVar.a(ExceptionParcel.a(new RuntimeException("Ads service disabled.")));
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.request.h
    public final void c(com.google.android.gms.ads.internal.request.i iVar) {
        try {
            iVar.a(ExceptionParcel.a(new RuntimeException("Ads service disabled.")));
        } catch (RemoteException unused) {
        }
    }
}
