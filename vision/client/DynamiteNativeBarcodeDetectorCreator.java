package com.google.android.gms.vision.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;
import defpackage.anzs;
import defpackage.azht;
import defpackage.dibc;
import defpackage.dibt;
import defpackage.dibv;
import defpackage.dibw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes7.dex */
public class DynamiteNativeBarcodeDetectorCreator extends dibv {
    @Override // defpackage.dibw
    public dibt newBarcodeDetector(azht azhtVar, BarcodeDetectorOptions barcodeDetectorOptions) {
        Context a = anzs.a((Context) ObjectWrapper.a(azhtVar), "com.google.android.gms.vision.dynamite");
        if (a == null) {
            dibc.a("%s could not be loaded.", "com.google.android.gms.vision.dynamite");
            throw new RemoteException();
        }
        dibw asInterface = dibv.asInterface(anzs.b(a.getClassLoader(), "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"));
        if (asInterface != null) {
            return asInterface.newBarcodeDetector(azhtVar, barcodeDetectorOptions);
        }
        dibc.a("Could not load Chimera native barcode detector creator.", new Object[0]);
        throw new RemoteException();
    }
}
