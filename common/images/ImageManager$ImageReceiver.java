package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import defpackage.atvj;
import defpackage.atvk;
import defpackage.atvs;
import defpackage.caqj;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
final class ImageManager$ImageReceiver extends ResultReceiver {
    private final ArrayList imageRequestList;
    final /* synthetic */ atvj this$0;
    private final Uri uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageManager$ImageReceiver(atvj atvjVar, Uri uri) {
        super(new caqj(Looper.getMainLooper()));
        this.this$0 = atvjVar;
        this.uri = uri;
        this.imageRequestList = new ArrayList();
    }

    private static void sendBroadcastWithShareIdentity(Context context, Intent intent) {
        context.sendBroadcast(intent);
    }

    public void addImageRequest(atvk atvkVar) {
        atvs.a("ImageReceiver.addImageRequest() must be called in the main thread");
        this.imageRequestList.add(atvkVar);
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        if (parcelFileDescriptor != null) {
            new AssetFileDescriptor(parcelFileDescriptor, bundle.getLong("assetFdStartOffset", 0L), bundle.getLong("assetFdLength", -1L));
        }
        atvj atvjVar = this.this$0;
        int i2 = atvj.c;
        ExecutorService executorService = atvjVar.b;
        throw null;
    }

    public void removeImageRequest(atvk atvkVar) {
        atvs.a("ImageReceiver.removeImageRequest() must be called in the main thread");
        this.imageRequestList.remove(atvkVar);
    }

    public void sendBroadcast() {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("com.google.android.gms.extras.uri", this.uri);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        int i = atvj.c;
        Context context = this.this$0.a;
        sendBroadcastWithShareIdentity(null, intent);
    }
}
