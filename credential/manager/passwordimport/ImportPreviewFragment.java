package com.google.android.gms.credential.manager.passwordimport;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.credential.manager.passwordimport.ImportPreviewFragment;
import defpackage.avnd;
import defpackage.avpy;
import defpackage.avqe;
import defpackage.avqf;
import defpackage.avqg;
import defpackage.avqh;
import defpackage.avqi;
import defpackage.avta;
import defpackage.avtm;
import defpackage.awyf;
import defpackage.awzk;
import defpackage.dg;
import defpackage.fuuw;
import defpackage.fuux;
import defpackage.fuuy;
import defpackage.fvaq;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.jqx;
import defpackage.kdr;
import defpackage.kiw;
import defpackage.qfp;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ImportPreviewFragment extends avtm {
    public avnd a;
    public awyf b;

    public static final avta x(fuuw fuuwVar) {
        return (avta) fuuwVar.a();
    }

    public static final void y(RecyclerView recyclerView, final String str, final int i) {
        recyclerView.ah(new awzk(R.layout.pwm_import_status, new fvaq() { // from class: avpu
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                View view = (View) obj;
                fvbo.f(view, "$this$SingleViewAdapter");
                TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_file_name);
                textView.setText(str);
                textView.setVisibility(0);
                TextView textView2 = (TextView) view.findViewById(R.id.pwm_import_status_error_message);
                textView2.setText(textView2.getResources().getString(i));
                textView2.setVisibility(0);
                view.findViewById(R.id.pwm_import_status_error_icon).setVisibility(0);
                return fuvs.a;
            }
        }));
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fvbo.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.pwm_import_preview, viewGroup, false);
        dg g = getParentFragmentManager().g(R.id.nav_host_fragment);
        fvbo.c(g);
        final kdr a = kiw.a(g);
        dg h = ((qfp) requireContext()).getSupportFragmentManager().h("PWMImportScreenFragment");
        fvbo.c(h);
        fuuw a2 = fuux.a(fuuy.c, new avqe(new avpy(h)));
        int i = fvcc.a;
        final jqx jqxVar = new jqx(new fvbi(avta.class), new avqf(a2), new avqh(this, a2), new avqg(a2));
        final RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.pwm_import_preview_recycler_view);
        if (x(jqxVar).j.hT() == null) {
            a.j(R.id.ImportValidationFragment);
        }
        x(jqxVar).j.g(getViewLifecycleOwner(), new avqi(new fvaq() { // from class: avpz
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                avsp avspVar = (avsp) obj;
                boolean z = avspVar instanceof avsg;
                RecyclerView recyclerView2 = recyclerView;
                fuuw fuuwVar = jqxVar;
                if (z) {
                    fvbo.c(recyclerView2);
                    final String b = ImportPreviewFragment.x(fuuwVar).b();
                    final avsg avsgVar = (avsg) avspVar;
                    recyclerView2.ah(new qs(new awzk(R.layout.pwm_import_status, new fvaq() { // from class: avpr
                        @Override // defpackage.fvaq
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fvbo.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b);
                            TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_valid_passwords_count);
                            Resources resources = textView.getResources();
                            List list = avsgVar.a;
                            textView.setText(resources.getQuantityString(R.plurals.pwm_import_preview_valid_passwords_count, list.size(), Integer.valueOf(list.size())));
                            textView.setVisibility(0);
                            view.findViewById(R.id.pwm_import_status_ok_icon).setVisibility(0);
                            return fuvs.a;
                        }
                    }), new avtl(avsgVar.a)));
                } else if (avspVar instanceof avsn) {
                    fvbo.c(recyclerView2);
                    final String b2 = ImportPreviewFragment.x(fuuwVar).b();
                    final avsn avsnVar = (avsn) avspVar;
                    recyclerView2.ah(new qs(new awzk(R.layout.pwm_import_status, new fvaq() { // from class: avpq
                        @Override // defpackage.fvaq
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fvbo.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b2);
                            TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_valid_passwords_count);
                            Resources resources = textView.getResources();
                            avsn avsnVar2 = avsnVar;
                            List list = avsnVar2.a;
                            textView.setText(resources.getQuantityString(R.plurals.pwm_import_preview_valid_passwords_count, list.size(), Integer.valueOf(list.size())));
                            textView.setVisibility(0);
                            TextView textView2 = (TextView) view.findViewById(R.id.pwm_import_status_invalid_passwords_count);
                            Resources resources2 = textView2.getResources();
                            List list2 = avsnVar2.b;
                            textView2.setText(resources2.getQuantityString(R.plurals.pwm_import_preview_invalid_passwords_count, list2.size(), Integer.valueOf(list2.size())));
                            textView2.setVisibility(0);
                            view.findViewById(R.id.pwm_import_status_warning_icon).setVisibility(0);
                            return fuvs.a;
                        }
                    }), new awzk(R.layout.pwm_import_password_list_header, new fvaq() { // from class: avpv
                        @Override // defpackage.fvaq
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fvbo.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_password_list_header)).setText(view.getResources().getString(R.string.pwm_import_preview_not_importable_passwords_header));
                            return fuvs.a;
                        }
                    }), new avpp(avsnVar.b), new awzk(), new awzk(R.layout.pwm_import_password_list_header, new fvaq() { // from class: avpw
                        @Override // defpackage.fvaq
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fvbo.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_password_list_header)).setText(view.getResources().getString(R.string.pwm_import_preview_importable_passwords_header));
                            return fuvs.a;
                        }
                    }), new avtl(avsnVar.a)));
                } else if (avspVar instanceof avsh) {
                    fvbo.c(recyclerView2);
                    final String b3 = ImportPreviewFragment.x(fuuwVar).b();
                    final avsh avshVar = (avsh) avspVar;
                    recyclerView2.ah(new qs(new awzk(R.layout.pwm_import_status, new fvaq() { // from class: avps
                        @Override // defpackage.fvaq
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fvbo.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b3);
                            TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_valid_passwords_count);
                            textView.setText(textView.getResources().getString(R.string.pwm_import_preview_no_passwords_can_be_imported));
                            textView.setVisibility(0);
                            TextView textView2 = (TextView) view.findViewById(R.id.pwm_import_status_invalid_passwords_count);
                            Resources resources = textView2.getResources();
                            List list = avshVar.a;
                            textView2.setText(resources.getQuantityString(R.plurals.pwm_import_preview_invalid_passwords_count, list.size(), Integer.valueOf(list.size())));
                            textView2.setVisibility(0);
                            view.findViewById(R.id.pwm_import_status_error_icon).setVisibility(0);
                            return fuvs.a;
                        }
                    }), new avpp(avshVar.a)));
                } else {
                    final ImportPreviewFragment importPreviewFragment = ImportPreviewFragment.this;
                    if (fvbo.n(avspVar, avsm.a)) {
                        fvbo.c(recyclerView2);
                        ImportPreviewFragment.y(recyclerView2, ImportPreviewFragment.x(fuuwVar).b(), R.string.pwm_import_preview_no_passwords_can_be_imported);
                    } else if (fvbo.n(avspVar, avsi.a)) {
                        fvbo.c(recyclerView2);
                        recyclerView2.ah(new awzk(R.layout.pwm_import_status, new fvaq() { // from class: avpt
                            @Override // defpackage.fvaq
                            public final Object a(Object obj2) {
                                View view = (View) obj2;
                                fvbo.f(view, "$this$SingleViewAdapter");
                                ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setVisibility(8);
                                TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_error_message_file_name_unknown);
                                textView.setText(textView.getResources().getString(R.string.pwm_import_preview_file_read_error));
                                textView.setVisibility(0);
                                view.findViewById(R.id.pwm_import_status_error_icon).setVisibility(0);
                                return fuvs.a;
                            }
                        }));
                    } else if (fvbo.n(avspVar, avsj.a)) {
                        fvbo.c(recyclerView2);
                        ImportPreviewFragment.y(recyclerView2, ImportPreviewFragment.x(fuuwVar).b(), R.string.pwm_import_preview_file_read_error);
                    } else if (fvbo.n(avspVar, avsk.a)) {
                        fvbo.c(recyclerView2);
                        ImportPreviewFragment.y(recyclerView2, ImportPreviewFragment.x(fuuwVar).b(), R.string.common_something_went_wrong);
                    } else if (fvbo.n(avspVar, avsl.a)) {
                        fvbo.c(recyclerView2);
                        final String b4 = ImportPreviewFragment.x(fuuwVar).b();
                        recyclerView2.ah(new awzk(R.layout.pwm_import_status, new fvaq() { // from class: avpx
                            @Override // defpackage.fvaq
                            public final Object a(Object obj2) {
                                View view = (View) obj2;
                                fvbo.f(view, "$this$SingleViewAdapter");
                                ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b4);
                                TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_error_message);
                                awyf awyfVar = importPreviewFragment.b;
                                if (awyfVar == null) {
                                    fvbo.j("learnMoreUtility");
                                    awyfVar = null;
                                }
                                fvbo.c(textView);
                                Uri uri = awyd.c;
                                fvbo.e(uri, "PASSWORD_IMPORT_HELPCENTER_URL");
                                awyfVar.a(textView, R.string.pwm_import_preview_unsupported_format_error, uri);
                                textView.setVisibility(0);
                                view.findViewById(R.id.pwm_import_status_error_icon).setVisibility(0);
                                return fuvs.a;
                            }
                        }));
                    } else {
                        if (!fvbo.n(avspVar, avso.a)) {
                            throw new fuuz();
                        }
                        fvbo.c(recyclerView2);
                        ImportPreviewFragment.y(recyclerView2, ImportPreviewFragment.x(fuuwVar).b(), R.string.pwm_import_preview_too_many_passwords_error);
                    }
                }
                return fuvs.a;
            }
        }));
        final Button button = (Button) inflate.findViewById(R.id.pwm_import_preview_start_import);
        x(jqxVar).l.g(getViewLifecycleOwner(), new avqi(new fvaq() { // from class: avqa
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                button.setVisibility(true != ((Boolean) obj).booleanValue() ? 4 : 0);
                return fuvs.a;
            }
        }));
        button.setOnClickListener(new View.OnClickListener() { // from class: avqb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avta x = ImportPreviewFragment.x(jqxVar);
                fvgt.b(jqw.a(x), null, null, new avsy(x, null), 3);
                kdr.this.j(R.id.action_ImportPreviewFragment_to_ImportProgressFragment);
            }
        });
        final Button button2 = (Button) inflate.findViewById(R.id.pwm_import_preview_done);
        x(jqxVar).n.g(getViewLifecycleOwner(), new avqi(new fvaq() { // from class: avqc
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                button2.setVisibility(true != ((Boolean) obj).booleanValue() ? 4 : 0);
                return fuvs.a;
            }
        }));
        button2.setOnClickListener(new View.OnClickListener() { // from class: avqd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avnd avndVar = ImportPreviewFragment.this.a;
                if (avndVar == null) {
                    fvbo.j("navigationController");
                    avndVar = null;
                }
                avndVar.a();
            }
        });
        fvbo.c(inflate);
        return inflate;
    }
}
