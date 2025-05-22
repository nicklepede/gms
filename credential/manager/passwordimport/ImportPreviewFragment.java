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
import defpackage.axrd;
import defpackage.axty;
import defpackage.axue;
import defpackage.axuf;
import defpackage.axug;
import defpackage.axuh;
import defpackage.axui;
import defpackage.axxa;
import defpackage.axxm;
import defpackage.azcf;
import defpackage.azdk;
import defpackage.dg;
import defpackage.fxqu;
import defpackage.fxqv;
import defpackage.fxqw;
import defpackage.fxwo;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.jxm;
import defpackage.lwb;
import defpackage.mbh;
import defpackage.ryt;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ImportPreviewFragment extends axxm {
    public axrd a;
    public azcf b;

    public static final axxa x(fxqu fxquVar) {
        return (axxa) fxquVar.a();
    }

    public static final void y(RecyclerView recyclerView, final String str, final int i) {
        recyclerView.ah(new azdk(R.layout.pwm_import_status, new fxwo() { // from class: axtu
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                View view = (View) obj;
                fxxm.f(view, "$this$SingleViewAdapter");
                TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_file_name);
                textView.setText(str);
                textView.setVisibility(0);
                TextView textView2 = (TextView) view.findViewById(R.id.pwm_import_status_error_message);
                textView2.setText(textView2.getResources().getString(i));
                textView2.setVisibility(0);
                view.findViewById(R.id.pwm_import_status_error_icon).setVisibility(0);
                return fxrq.a;
            }
        }));
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fxxm.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.pwm_import_preview, viewGroup, false);
        dg g = getParentFragmentManager().g(R.id.nav_host_fragment);
        fxxm.c(g);
        final lwb a = mbh.a(g);
        dg h = ((ryt) requireContext()).getSupportFragmentManager().h("PWMImportScreenFragment");
        fxxm.c(h);
        fxqu a2 = fxqv.a(fxqw.c, new axue(new axty(h)));
        int i = fxya.a;
        final jxm jxmVar = new jxm(new fxxg(axxa.class), new axuf(a2), new axuh(this, a2), new axug(a2));
        final RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.pwm_import_preview_recycler_view);
        if (x(jxmVar).j.ii() == null) {
            a.j(R.id.ImportValidationFragment);
        }
        x(jxmVar).j.g(getViewLifecycleOwner(), new axui(new fxwo() { // from class: axtz
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                axwp axwpVar = (axwp) obj;
                boolean z = axwpVar instanceof axwg;
                RecyclerView recyclerView2 = recyclerView;
                fxqu fxquVar = jxmVar;
                if (z) {
                    fxxm.c(recyclerView2);
                    final String b = ImportPreviewFragment.x(fxquVar).b();
                    final axwg axwgVar = (axwg) axwpVar;
                    recyclerView2.ah(new qx(new azdk(R.layout.pwm_import_status, new fxwo() { // from class: axtr
                        @Override // defpackage.fxwo
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fxxm.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b);
                            TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_valid_passwords_count);
                            Resources resources = textView.getResources();
                            List list = axwgVar.a;
                            textView.setText(resources.getQuantityString(R.plurals.pwm_import_preview_valid_passwords_count, list.size(), Integer.valueOf(list.size())));
                            textView.setVisibility(0);
                            view.findViewById(R.id.pwm_import_status_ok_icon).setVisibility(0);
                            return fxrq.a;
                        }
                    }), new axxl(axwgVar.a)));
                } else if (axwpVar instanceof axwn) {
                    fxxm.c(recyclerView2);
                    final String b2 = ImportPreviewFragment.x(fxquVar).b();
                    final axwn axwnVar = (axwn) axwpVar;
                    recyclerView2.ah(new qx(new azdk(R.layout.pwm_import_status, new fxwo() { // from class: axtq
                        @Override // defpackage.fxwo
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fxxm.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b2);
                            TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_valid_passwords_count);
                            Resources resources = textView.getResources();
                            axwn axwnVar2 = axwnVar;
                            List list = axwnVar2.a;
                            textView.setText(resources.getQuantityString(R.plurals.pwm_import_preview_valid_passwords_count, list.size(), Integer.valueOf(list.size())));
                            textView.setVisibility(0);
                            TextView textView2 = (TextView) view.findViewById(R.id.pwm_import_status_invalid_passwords_count);
                            Resources resources2 = textView2.getResources();
                            List list2 = axwnVar2.b;
                            textView2.setText(resources2.getQuantityString(R.plurals.pwm_import_preview_invalid_passwords_count, list2.size(), Integer.valueOf(list2.size())));
                            textView2.setVisibility(0);
                            view.findViewById(R.id.pwm_import_status_warning_icon).setVisibility(0);
                            return fxrq.a;
                        }
                    }), new azdk(R.layout.pwm_import_password_list_header, new fxwo() { // from class: axtv
                        @Override // defpackage.fxwo
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fxxm.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_password_list_header)).setText(view.getResources().getString(R.string.pwm_import_preview_not_importable_passwords_header));
                            return fxrq.a;
                        }
                    }), new axtp(axwnVar.b), new azdk(), new azdk(R.layout.pwm_import_password_list_header, new fxwo() { // from class: axtw
                        @Override // defpackage.fxwo
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fxxm.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_password_list_header)).setText(view.getResources().getString(R.string.pwm_import_preview_importable_passwords_header));
                            return fxrq.a;
                        }
                    }), new axxl(axwnVar.a)));
                } else if (axwpVar instanceof axwh) {
                    fxxm.c(recyclerView2);
                    final String b3 = ImportPreviewFragment.x(fxquVar).b();
                    final axwh axwhVar = (axwh) axwpVar;
                    recyclerView2.ah(new qx(new azdk(R.layout.pwm_import_status, new fxwo() { // from class: axts
                        @Override // defpackage.fxwo
                        public final Object a(Object obj2) {
                            View view = (View) obj2;
                            fxxm.f(view, "$this$SingleViewAdapter");
                            ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b3);
                            TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_valid_passwords_count);
                            textView.setText(textView.getResources().getString(R.string.pwm_import_preview_no_passwords_can_be_imported));
                            textView.setVisibility(0);
                            TextView textView2 = (TextView) view.findViewById(R.id.pwm_import_status_invalid_passwords_count);
                            Resources resources = textView2.getResources();
                            List list = axwhVar.a;
                            textView2.setText(resources.getQuantityString(R.plurals.pwm_import_preview_invalid_passwords_count, list.size(), Integer.valueOf(list.size())));
                            textView2.setVisibility(0);
                            view.findViewById(R.id.pwm_import_status_error_icon).setVisibility(0);
                            return fxrq.a;
                        }
                    }), new axtp(axwhVar.a)));
                } else {
                    final ImportPreviewFragment importPreviewFragment = ImportPreviewFragment.this;
                    if (fxxm.n(axwpVar, axwm.a)) {
                        fxxm.c(recyclerView2);
                        ImportPreviewFragment.y(recyclerView2, ImportPreviewFragment.x(fxquVar).b(), R.string.pwm_import_preview_no_passwords_can_be_imported);
                    } else if (fxxm.n(axwpVar, axwi.a)) {
                        fxxm.c(recyclerView2);
                        recyclerView2.ah(new azdk(R.layout.pwm_import_status, new fxwo() { // from class: axtt
                            @Override // defpackage.fxwo
                            public final Object a(Object obj2) {
                                View view = (View) obj2;
                                fxxm.f(view, "$this$SingleViewAdapter");
                                ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setVisibility(8);
                                TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_error_message_file_name_unknown);
                                textView.setText(textView.getResources().getString(R.string.pwm_import_preview_file_read_error));
                                textView.setVisibility(0);
                                view.findViewById(R.id.pwm_import_status_error_icon).setVisibility(0);
                                return fxrq.a;
                            }
                        }));
                    } else if (fxxm.n(axwpVar, axwj.a)) {
                        fxxm.c(recyclerView2);
                        ImportPreviewFragment.y(recyclerView2, ImportPreviewFragment.x(fxquVar).b(), R.string.pwm_import_preview_file_read_error);
                    } else if (fxxm.n(axwpVar, axwk.a)) {
                        fxxm.c(recyclerView2);
                        ImportPreviewFragment.y(recyclerView2, ImportPreviewFragment.x(fxquVar).b(), R.string.common_something_went_wrong);
                    } else if (fxxm.n(axwpVar, axwl.a)) {
                        fxxm.c(recyclerView2);
                        final String b4 = ImportPreviewFragment.x(fxquVar).b();
                        recyclerView2.ah(new azdk(R.layout.pwm_import_status, new fxwo() { // from class: axtx
                            @Override // defpackage.fxwo
                            public final Object a(Object obj2) {
                                View view = (View) obj2;
                                fxxm.f(view, "$this$SingleViewAdapter");
                                ((TextView) view.findViewById(R.id.pwm_import_status_file_name)).setText(b4);
                                TextView textView = (TextView) view.findViewById(R.id.pwm_import_status_error_message);
                                azcf azcfVar = importPreviewFragment.b;
                                if (azcfVar == null) {
                                    fxxm.j("learnMoreUtility");
                                    azcfVar = null;
                                }
                                fxxm.c(textView);
                                Uri uri = azcd.c;
                                fxxm.e(uri, "PASSWORD_IMPORT_HELPCENTER_URL");
                                azcfVar.a(textView, R.string.pwm_import_preview_unsupported_format_error, uri);
                                textView.setVisibility(0);
                                view.findViewById(R.id.pwm_import_status_error_icon).setVisibility(0);
                                return fxrq.a;
                            }
                        }));
                    } else {
                        if (!fxxm.n(axwpVar, axwo.a)) {
                            throw new fxqx();
                        }
                        fxxm.c(recyclerView2);
                        ImportPreviewFragment.y(recyclerView2, ImportPreviewFragment.x(fxquVar).b(), R.string.pwm_import_preview_too_many_passwords_error);
                    }
                }
                return fxrq.a;
            }
        }));
        final Button button = (Button) inflate.findViewById(R.id.pwm_import_preview_start_import);
        x(jxmVar).l.g(getViewLifecycleOwner(), new axui(new fxwo() { // from class: axua
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                button.setVisibility(true != ((Boolean) obj).booleanValue() ? 4 : 0);
                return fxrq.a;
            }
        }));
        button.setOnClickListener(new View.OnClickListener() { // from class: axub
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                axxa x = ImportPreviewFragment.x(jxmVar);
                fycr.b(jxl.a(x), null, null, new axwy(x, null), 3);
                lwb.this.j(R.id.action_ImportPreviewFragment_to_ImportProgressFragment);
            }
        });
        final Button button2 = (Button) inflate.findViewById(R.id.pwm_import_preview_done);
        x(jxmVar).n.g(getViewLifecycleOwner(), new axui(new fxwo() { // from class: axuc
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                button2.setVisibility(true != ((Boolean) obj).booleanValue() ? 4 : 0);
                return fxrq.a;
            }
        }));
        button2.setOnClickListener(new View.OnClickListener() { // from class: axud
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                axrd axrdVar = ImportPreviewFragment.this.a;
                if (axrdVar == null) {
                    fxxm.j("navigationController");
                    axrdVar = null;
                }
                axrdVar.a();
            }
        });
        fxxm.c(inflate);
        return inflate;
    }
}
