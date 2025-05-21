package com.google.android.gms.backup.transport.postd2dapptransfer;

import android.content.Intent;
import com.google.android.gms.backup.transport.postd2dapptransfer.PostD2dAppTransferInitIntentOperation;
import defpackage.ahwd;
import defpackage.akjw;
import defpackage.akka;
import defpackage.akkm;
import defpackage.anya;
import defpackage.arxo;
import defpackage.floy;
import defpackage.phh;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PostD2dAppTransferInitIntentOperation extends anya {
    private static final arxo b = ahwd.a("PostD2dAppTransferInitIntentOperation");
    public final Optional a;

    public PostD2dAppTransferInitIntentOperation() {
        this.a = Optional.empty();
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (floy.a.a().R()) {
            if ((i == 4 || i == 8) && !floy.a.a().P()) {
                return;
            }
            b.j("Init PostD2dAppTransfer feature on action ".concat(String.valueOf(intent.getAction())), new Object[0]);
            arxo arxoVar = akjw.a;
            final phh phhVar = new phh(this, akjw.b);
            final akkm akkmVar = new akkm();
            akjw.c(new Runnable() { // from class: akkl
                @Override // java.lang.Runnable
                public final void run() {
                    final PostD2dAppTransferInitIntentOperation postD2dAppTransferInitIntentOperation = PostD2dAppTransferInitIntentOperation.this;
                    akka akkaVar = (akka) postD2dAppTransferInitIntentOperation.a.orElseGet(new Supplier() { // from class: akkk
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return akjw.a(PostD2dAppTransferInitIntentOperation.this);
                        }
                    });
                    akjw.d(akkaVar, akkmVar);
                    akjw.f(akkaVar, phhVar);
                }
            }, "Failed to refresh app data cleanup listener configurations on device boot up event", akkmVar);
        }
    }

    PostD2dAppTransferInitIntentOperation(akka akkaVar) {
        this.a = Optional.of(akkaVar);
    }
}
